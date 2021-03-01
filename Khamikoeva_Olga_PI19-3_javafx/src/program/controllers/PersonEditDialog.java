package program.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import program.models.Person;
import program.utils.DateUtil;

public class PersonEditDialog{
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField streetField;
    @FXML
    private TextField cityField;
    @FXML
    private TextField postalCodeField;
    @FXML
    private TextField birthdayField;

    private Stage dialogStage;
    private Person person;
    private boolean okClicked = false;

    @FXML
    private void initialize(){}

    public void setDialogStage(Stage dialogStage) { this.dialogStage =  dialogStage;}

    public void setPerson(Person person){
        this.person = person;

        firstNameField.setText(person.getFirstName());
        lastNameField.setText(person.getLastName());
        streetField.setText(person.getStreet());
        cityField.setText(person.getCity());
        postalCodeField.setText(Integer.toString(person.getPostalCode()));
        birthdayField.setText(DateUtil.format(person.getBirthDay()));
        birthdayField.setPromptText("dd.mm.yyyy");
    }
    public boolean isOkClicked() {
        return okClicked;
    }

    @FXML
    private void handleCancel() {
        dialogStage.close();
    }

    @FXML
    private void handleOK() {
        if (isInputValid()) {
            person.setFirstName(firstNameField.getText());
            person.setLastName(lastNameField.getText());
            person.setStreet(streetField.getText());
            person.setPostalCode(Integer.parseInt(postalCodeField.getText()));
            person.setCity(cityField.getText());
            person.setBirthDay(DateUtil.parse(birthdayField.getText()));

            okClicked = true;
            dialogStage.close();
        }
    }

    private boolean isInputValid() {
        String errorMessage = "";

        if (firstNameField.getText() == null || firstNameField.getText().length() == 0) {errorMessage += "Неверно введено имя!\n";}
        if (lastNameField.getText() == null || lastNameField.getText().length() == 0) {errorMessage += "Неверно введена фамилия!.\n";}
        if (streetField.getText() == null || streetField.getText().length() == 0) {errorMessage += "Неверно введена улица!\n";}
        if (postalCodeField.getText() == null || postalCodeField.getText().length() == 0) {errorMessage += "Неверно введен почтовый индекс!\n";
        } else {
            try {
                Integer.parseInt(postalCodeField.getText());
            } catch (NumberFormatException e) {
                errorMessage += "Неверно набран почтовый индекс (введите число)!\n";
            }
        }

        if (cityField.getText() == null || cityField.getText().length() == 0) {errorMessage += "Неверно набран город!\n";}
        if (birthdayField.getText() == null || birthdayField.getText().length() == 0) {errorMessage += "Неверно введена дата!\n";
        } else {
            if (!DateUtil.validDate(birthdayField.getText())) {
                errorMessage += "Неверно введена дата. Используйте шаблон yyyy.mm.dd!\n";
            }
        }

        if (errorMessage.length() == 0) {
            return true;
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.initOwner(dialogStage);
            alert.setTitle("Некорректные данные");
            alert.setHeaderText("Введите данные");
            alert.setContentText(errorMessage);

            alert.showAndWait();

            return false;
        }
    }
}