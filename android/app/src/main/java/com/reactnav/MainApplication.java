package com.reactnav;

import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.reactnativenavigation.NavigationApplication;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Nullable;

public class MainApplication extends NavigationApplication {


  @Override
  public String getJSMainModuleName() {
    return "index";
  }

  @Override
  public boolean isDebug(){
    return BuildConfig.DEBUG;
  }

  protected List<ReactPackage> getPackages() {
    // Add additional packages you require here
    // No need to add RnnPackage and MainReactPackage
    return Arrays.<ReactPackage>asList(
            new MainReactPackage()
            // eg. new VectorIconsPackage()
    );
  }

  @Nullable
  @Override
  public List<ReactPackage> createAdditionalReactPackages() {
    return getPackages();
  }
}
