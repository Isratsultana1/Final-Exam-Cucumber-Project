$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/techfios.feature");
formatter.feature({
  "name": "Techfios colour page functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to change colour with valid credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Scenerio1"
    }
  ]
});
formatter.step({
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.ColourPage.Set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.ColourPage.i_click_on_the_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.ColourPage.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "White Background Change with valid credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Scenerio2"
    }
  ]
});
formatter.step({
  "name": "User Set SkyWhite Background button exists",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.ColourPage.user_Set_SkyWhite_Background_button_exists()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the button2",
  "keyword": "When "
});
formatter.match({
  "location": "steps.ColourPage.user_click_on_the_button2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.ColourPage.the_background_color_will_change_to_white()"
});
formatter.result({
  "status": "passed"
});
});