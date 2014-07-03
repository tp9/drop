package com.badlogic.drop.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.badlogic.drop.Drop;

public class HtmlLauncher extends GwtApplication {

        @Override
        public GwtApplicationConfiguration getConfig () {
        		GwtApplicationConfiguration config = new GwtApplicationConfiguration(800, 480);
                return config;
        }

        @Override
        public ApplicationListener getApplicationListener () {
                return new Drop();
        }
}