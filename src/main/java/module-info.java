module de.sirmelonchen.embed_downloader {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens de.sirmelonchen.embed_downloader to javafx.fxml;
    exports de.sirmelonchen.embed_downloader;
}