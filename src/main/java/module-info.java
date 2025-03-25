module org.example.ormhibernatefinalcw {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;

    opens org.example.ormhibernatefinalcw.entity to org.hibernate.orm.core;
    opens org.example.ormhibernatefinalcw.config to jakarta.persistence;


    opens org.example.ormhibernatefinalcw to javafx.fxml;
    opens org.example.ormhibernatefinalcw.controller to javafx.fxml;
    opens org.example.ormhibernatefinalcw.controller.ricieption to javafx.fxml;
    opens org.example.ormhibernatefinalcw.dto to javafx.base;
    opens org.example.ormhibernatefinalcw.dto.tm to javafx.base;

    exports org.example.ormhibernatefinalcw;
    opens org.example.ormhibernatefinalcw.controller.admin to javafx.fxml;
}