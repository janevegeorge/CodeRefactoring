package me.janeve.refactoring.a_composing_method.c_extract_variable;

public class ExtractVariable {

    Platform platform = new Platform("MAC OS 10");
    Browser browser = new Browser("IE");
    private int resize = 10;

    void renderBanner() {
        if ((platform.toUpperCase().indexOf("MAC") > -1) &&
                (browser.toUpperCase().indexOf("IE") > -1) &&
                wasInitialized() && resize > 0 )
        {
            // do something
        }
    }

    private boolean wasInitialized() {
        return true;
    }

}