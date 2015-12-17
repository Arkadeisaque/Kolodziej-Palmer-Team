/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.quest.view;

import java.io.PrintWriter;
import quest.Quest;

/**
 *
 * @author Arkadiusz
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = Quest.getOutFile();
    private static final PrintWriter logFile = Quest.getLogFile();
    
    public static void display(String className, String errorMessage) {
        errorFile.println("___________________________________________"
                        + "\n- ERROR - " + errorMessage
                        + "\n_________________________________________");
        // log error
        logFile.println(className + " - " + errorMessage);
    }
}
