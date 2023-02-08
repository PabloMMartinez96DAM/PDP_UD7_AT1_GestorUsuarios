/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managers;

import java.util.ArrayList;
import java.util.List;
import models.UserModel;

/**
 *
 * @author dam
 */
public class UserManager {

    private List<UserModel> users = new ArrayList<UserModel>();

    
    public boolean login(UserModel user) {
        boolean isFound = false;

        //Recorremos la lista de usuarios para comparar si el usuario que intenta
        //Loguearse existe en la lista de usuarios
        for (int i = 0; i < users.size() && !isFound; i++) {

            // Comprobamos si el nombre coincide para el log
            if (user.getName().equals(users.get(i).getName())) {

                //TODO: Logs bonitos
                // Si el usuario es igual, comprobamos la contraseña
                if (user.getPass().equals(users.get(i).getPass())) {

                    System.out.println("El usuario:" + user.getName() + " se ha logueado correctamente");
                    isFound = true;
                }
            }
        }
        return isFound;
    }
}
