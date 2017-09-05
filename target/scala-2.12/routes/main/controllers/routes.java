
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wisdom/Desktop/Projects/Java/playframework/keepnpay/conf/routes
// @DATE:Mon Sep 04 22:45:26 WAT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseRegister Register = new controllers.ReverseRegister(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLogin Login = new controllers.ReverseLogin(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseRegister Register = new controllers.javascript.ReverseRegister(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLogin Login = new controllers.javascript.ReverseLogin(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
