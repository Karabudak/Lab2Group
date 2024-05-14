package org.example.week2;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class StudentController {
    @FXML
    private TextField nameField;

    @FXML
    private TextField surnameField;

    @FXML
    private TextField idField;

    @FXML
    private TextField majorField;

    @FXML
    private TableView<Student> studentTable;

    @FXML
    private TableColumn<Student, String> nameColumn;

    @FXML
    private TableColumn<Student, String> surnameColumn;

    @FXML
    private TableColumn<Student, String> idColumn;

    @FXML
    private TableColumn<Student, String> majorColumn;

    private ObservableList<Student> studentData = FXCollections.observableArrayList();

    @FXML
    private void addStudent(ActionEvent event) {
        String name = nameField.getText();
        String surname = surnameField.getText();
        String major = majorField.getText();
        String id = idField.getText();

        if(id.isEmpty()||name.isEmpty()||surname.isEmpty()||major.isEmpty()){
            System.out.println("Please fill in all info.");
        } else {
            Student newStudent = new Student(name,surname,id, major);
            studentData.add(newStudent);
            clearFields();
        }
    // Create a new Student from text field data
    // Add the new Student to the table
    }

    private void clearFields() {
        idField.clear();
        nameField.clear();
        surnameField.clear();
        majorField.clear();
    }

    @FXML
    private void deleteStudent(ActionEvent event) {

    // Delete the selected Student from the table
    }

    @FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<Student,String>("name"));
        surnameColumn.setCellValueFactory(new PropertyValueFactory<Student,String>("surname"));
        majorColumn.setCellValueFactory(new PropertyValueFactory<Student,String>("major"));
    // Initialize the table
    }
}