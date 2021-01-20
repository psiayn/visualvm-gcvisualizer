/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.psiayn.test;
import org.graalvm.visualvm.application.Application;
import org.graalvm.visualvm.core.ui.DataSourceView;
import org.graalvm.visualvm.core.ui.DataSourceViewProvider;
import org.graalvm.visualvm.core.ui.DataSourceViewsManager;
import org.graalvm.visualvm.core.ui.components.DataViewComponent;
/**
 *
 * @author psiayn
 */
class GCViewerProvider extends DataSourceViewProvider<Application>{

    private static DataSourceViewProvider<Application> instance =  new GCViewerProvider();
    
    @Override
    public boolean supportsViewFor(Application application) {
        //Always shown:
        return true;
    }

    @Override
    public synchronized DataSourceView createView(final Application application) {
        return new GCViewerView(application);

    }

    static void initialize() {
        DataSourceViewsManager.sharedInstance().addViewProvider(instance, Application.class);
    }

    static void unregister() {
        DataSourceViewsManager.sharedInstance().removeViewProvider(instance);
    }
    
}
