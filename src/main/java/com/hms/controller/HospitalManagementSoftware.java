/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hms.controller;

import com.hms.model.PathologicalTest;
import com.hms.view.Home;

/**
 *
 * @author Banna
 */
public class HospitalManagementSoftware {

    public static void main(String[] args) {
        System.out.println("Hello, This is Banna");
        new Home().setVisible(true);
        PathologicalTest lTest = new PathologicalTest("CBC", 400, true);
        System.out.println(lTest.show());
        
    }
}
