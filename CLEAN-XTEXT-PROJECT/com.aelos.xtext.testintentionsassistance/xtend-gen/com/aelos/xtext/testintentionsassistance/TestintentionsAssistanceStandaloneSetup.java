/**
 * generated by Xtext 2.13.0
 */
package com.aelos.xtext.testintentionsassistance;

import com.aelos.xtext.testintentionsassistance.TestintentionsAssistanceStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class TestintentionsAssistanceStandaloneSetup extends TestintentionsAssistanceStandaloneSetupGenerated {
  public static void doSetup() {
    new TestintentionsAssistanceStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
