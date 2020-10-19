package practical3_task1;
//Реализовать класс обертку StringBuilder с поддержкой undo. Делегировать стандартные
//методы стандартному StringBUilder. Паттерн «Команда»
import java.util.Stack;
class UndoableStringBuilder {
    private interface Action {
        void undo();
    }

    private class DeleteAction implements Action {
        private int size;

        public DeleteAction(int size) {
            this.size = size;
        }

        public void undo() {
            stringBuilder.delete(
                    stringBuilder.length() - size, stringBuilder.length());
        }
    }

    private StringBuilder stringBuilder; // делегат

    private Stack<Action> actions = new Stack<>();

    // конструктор
    public UndoableStringBuilder() {
        stringBuilder = new StringBuilder();
    }

    /*
     На каждую операцию мы будем создавать обратную ей, добавляя ее в стек операций.
     Например, делаем reverce(), добавляем в стек операций обратное reverce()
     */
    public UndoableStringBuilder reverse() {
        stringBuilder.reverse(); //создаем нормальную

        Action action = new Action() {
            public void undo() {
                stringBuilder.reverse();
            }//создаём обратную
        };
        actions.add(action); //добавляем в стек операций
        return this;
    }


    public UndoableStringBuilder append(String str) {
        stringBuilder.append(str);

        Action action = new Action() {
            public void undo() {
                stringBuilder.delete(
                        stringBuilder.length() - str.length() - 1,
                        stringBuilder.length());
            }
        };
        actions.add(action);
        return this;
    }

    public UndoableStringBuilder delete(int start, int end) {
        String deleted = stringBuilder.substring(start, end);
        stringBuilder.delete(start, end);
        actions.add(() -> stringBuilder.insert(start, deleted));
        return this;
    }

    public UndoableStringBuilder deleteIndex(int index) {
        char deleted = stringBuilder.charAt(index);
        stringBuilder.deleteCharAt(index);
        actions.add(() -> stringBuilder.insert(index, deleted));
        return this;
    }

    public UndoableStringBuilder replace(int start, int end, String str) {
        String deleted = stringBuilder.substring(start, end);
        stringBuilder.replace(start, end, str);
        actions.add(() -> stringBuilder.replace(start, end, deleted));
        return this;
    }

    public UndoableStringBuilder insert(int index, char[] str, int offset, int len) {
        stringBuilder.insert(index, str, offset, len);
        actions.add(() -> stringBuilder.delete(index, len));
        return this;
    }

    public UndoableStringBuilder insert(int offset, String str) {
        stringBuilder.insert(offset, str);
        actions.add(() -> stringBuilder.delete(offset, str.length()));
        return this;
    }
    public void undo() {
        if (!actions.isEmpty()) {
            actions.pop().undo();
        }
    }

    public String toString() {
        return stringBuilder.toString();
    }
}