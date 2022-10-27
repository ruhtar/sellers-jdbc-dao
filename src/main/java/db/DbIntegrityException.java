package db;

import java.security.cert.Extension;

public class DbIntegrityException extends RuntimeException {
    public DbIntegrityException(String s) {
        super(s);
    }
}
