
Feature: Notas

  @user
  Scenario: Crear Una nota de texto enriquecido con letras en negrita
    Given el usuario ingresa al home de la aplicacion bloc de notas online
    When  ingresa el siguiente texto enriquecido "Creando texto en negrita" con titulo "Nota Testing
    Then El usuario podra ver el titulo de la nota en listado de notas creadas.