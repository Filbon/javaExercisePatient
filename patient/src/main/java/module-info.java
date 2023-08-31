module se.kth.filkle.patient {
    requires javafx.controls;
    requires javafx.fxml;


    opens se.kth.filkle.patient to javafx.fxml;
    exports se.kth.filkle.patient;
}