module com.ly.jdc.fxtuto {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.groovy;


    opens com.ly.jdc.fxtuto to javafx.fxml;
    exports com.ly.jdc.fxtuto;
}