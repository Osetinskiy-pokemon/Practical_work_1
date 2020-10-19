package practical3_task2;
import java.util.Stack;
//Написать класс StringBuilder с оповещением других объектов-слушателей об изменении
//своего состояния. Делегировать стандартные методы стандартному StringBuilder. Паттерн
//«Наблюдатель»
interface ChangedOnStringBuilderListener {
    void changedOn(OvserverableStringBuilder stringBuilder);
}

class OvserverableStringBuilder {

    // Слушатель, которого надо будет уведомить
    private ChangedOnStringBuilderListener changedOnListener;

    // делегат
    private StringBuilder stringBuilder;

    // Сеттер для changedOnListener
    public void setChangedOnListener(ChangedOnStringBuilderListener changedOnListener) {
        this.changedOnListener = changedOnListener;
    }

    public OvserverableStringBuilder() {
        stringBuilder = new StringBuilder();
    }

    private void notification(){
        if(changedOnListener != null){
            changedOnListener.changedOn(this);
        }
    }

    public OvserverableStringBuilder append(Object obj) {
        stringBuilder.append(obj);
        notification();
        return this;
    }

    public OvserverableStringBuilder replace(int start, int end, String str) {
        stringBuilder.replace(start, end, str);
        notification();
        return this;
    }

    public OvserverableStringBuilder reverce(){
        //stringBuilder.insert(index, str, offset, len);
        stringBuilder.reverse();
        notification();
        return this;
    }

    public String toString() {
        return stringBuilder.toString();
    }
}


class OurListener implements ChangedOnStringBuilderListener {
    /*
        Определяем метод changedOn (смена состояния), в который передаётся наша строка, а точнее StringBuilder,
        от которой ждем изменеий
     */
    public void changedOn(OvserverableStringBuilder stringBuilder) {
        System.out.println("Оп! Переход в новое состояние: " + stringBuilder.toString());
    }
}
