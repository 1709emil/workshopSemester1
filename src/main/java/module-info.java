module com.example.workshopsemester1 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.workshopsemester1 to javafx.fxml;
    exports com.example.workshopsemester1;
}