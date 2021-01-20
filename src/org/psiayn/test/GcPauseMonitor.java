/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.psiayn.test;

import org.openide.util.Exceptions;

/**
 *
 * @author psiayn
 */
public class GcPauseMonitor implements Runnable{
    
    private final GcDataCollector dataCollector;

    GcPauseMonitor(final GcDataCollector dataCollector) {
        this.dataCollector = dataCollector;
    }

    @Override
    public void run() {
        while (true) {
            dataCollector.checkGc();
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }
}
