package db;

public class DbException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Mensagem da excessão.
     * @param msg
     */
    public DbException(String msg){
        super(msg);
    }
}
