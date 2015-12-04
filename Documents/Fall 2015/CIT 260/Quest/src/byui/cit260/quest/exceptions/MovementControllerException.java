/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.quest.exceptions;

/**
 *
 * @author Arkadiusz
 */
public class MovementControllerException extends Exception {

    public MovementControllerException() {
    }

    public MovementControllerException(String message) {
        super(message);
    }

    public MovementControllerException(String message, Throwable cause) {
        super(message, cause);
    }

    public MovementControllerException(Throwable cause) {
        super(cause);
    }

    public MovementControllerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
