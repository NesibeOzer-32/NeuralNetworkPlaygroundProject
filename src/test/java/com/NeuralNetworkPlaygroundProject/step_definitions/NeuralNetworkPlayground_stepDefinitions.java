package com.NeuralNetworkPlaygroundProject.step_definitions;

import com.NeuralNetworkPlaygroundProject.pages.NeuralNetworkPlaygroundPage;
import com.NeuralNetworkPlaygroundProject.utilities.BrowserUtils;
import com.NeuralNetworkPlaygroundProject.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NeuralNetworkPlayground_stepDefinitions {

    NeuralNetworkPlaygroundPage neuralNetworkPlaygroundPage=new NeuralNetworkPlaygroundPage();
    Actions actions= new Actions(Driver.getDriver());


    @Given("user goes to the Neural Network Playground page")
    public void user_goes_to_the_neural_network_playground_page() {
        Driver.getDriver().get("https://playground.tensorflow.org/");
        BrowserUtils.sleep(5);


    }
    @When("user reports the test loss value")
    public void userReportsTheTestLossValue() {

        System.out.println( "First Test Loss Output" + neuralNetworkPlaygroundPage.TestLossOutput.getText());
        Assert.assertTrue(neuralNetworkPlaygroundPage.TestLossOutput.isDisplayed());
        BrowserUtils.sleep(5);
        System.out.println("user reports the test loss value in console ");
    }

    @And("user changes dataset to exclusive")
    public void userChangesDatasetToExclusive() {
        neuralNetworkPlaygroundPage.chooseDataset.click();
        BrowserUtils.sleep(5);
    }




    @Then("dataset has been changed by user")
    public void dataset_has_been_changed_by_user() {

        Assert.assertTrue(neuralNetworkPlaygroundPage.selectedDataset.isDisplayed());
        BrowserUtils.sleep(5);

    }
    @And("user changes noise to five percent")
    public void userChangesNoiseToFivePercent() {
        //slider--->dragAndDropBy(location,+number,0) right, dragAndDropBy(location,-number,0) left
        actions.moveToElement(neuralNetworkPlaygroundPage.noiseButton).
                dragAndDropBy(neuralNetworkPlaygroundPage.noiseButton,10,0).perform();
        BrowserUtils.sleep(5);
    }


    @Then("noise has been changed by user")
    public void noise_has_been_changed_by_user() {

        Assert.assertTrue(neuralNetworkPlaygroundPage.noise5.isDisplayed());
        BrowserUtils.sleep(5);
    }
    @And("user selects two more features")
    public void userSelectsTwoMoreFeatures() {

        neuralNetworkPlaygroundPage.feature3.click();
        neuralNetworkPlaygroundPage.feature4.click();

    }



    @Then("two more features has been selected by user")
    public void two_more_features_has_been_selected_by_user() {
        BrowserUtils.sleep(5);
        Assert.assertTrue(neuralNetworkPlaygroundPage.feature3.isDisplayed());
        Assert.assertTrue(neuralNetworkPlaygroundPage.feature4.isDisplayed());

    }

    @And("user removes two neurons")
    public void userRemovesTwoNeurons() {

        Assert.assertTrue(neuralNetworkPlaygroundPage.FirstnumberOfNeurens.isDisplayed());
        System.out.println("4 Neurons selected ");
        Assert.assertTrue(neuralNetworkPlaygroundPage.SecondnumberOfNeurens.isDisplayed());
        System.out.println("2 Neurons selected ");

        neuralNetworkPlaygroundPage.removeNeuronD.click();
        neuralNetworkPlaygroundPage.removeNeuronE.click();
    }

    @And("neurons has been removed by user")
    public void neuronsHasBeenRemovedByUser() {
        BrowserUtils.sleep(5);
        Assert.assertTrue(neuralNetworkPlaygroundPage.FirstNumberOfNeurensAfterRemove.isDisplayed());
        BrowserUtils.sleep(5);
        System.out.println("3 Neurons selected ");
        Assert.assertTrue(neuralNetworkPlaygroundPage.SecondNumberOfNeurensAfterRemove.isDisplayed());
        BrowserUtils.sleep(5);
        System.out.println("1 Neuron selected ");
        System.out.println("neurons has been removed by user");

    }
    @And("user changes learning rate to point one .")
    public void userChangesLearningRateToPointOne() {
        //select dropdown

        Select select= new Select(neuralNetworkPlaygroundPage.sellectLearningRateBttn);
        select.selectByValue("0.1");
        BrowserUtils.sleep(5);


    }

    @And("learning rate to point one has been changed by user")
    public void learningRateToPointOneHasBeenChangedByUser() {
        Assert.assertTrue(neuralNetworkPlaygroundPage.newLearningRate.isDisplayed());
    }


    @And("user clicks to run the simulation.")
    public void userClicksToRunTheSimulation() {

        neuralNetworkPlaygroundPage.runSimulation.click();
        BrowserUtils.sleep(15);
    }


    @And("user waits until epoch is more than point three.")
    public void userWaitsUntilEpochIsMoreThanPointThree() {

        neuralNetworkPlaygroundPage.pauseSimulation.click();


    }

    @And("epoch is more than point three")
    public void epochIsMoreThanPointThree() {
        BrowserUtils.sleep(5);

        if (neuralNetworkPlaygroundPage.epoch.getText().contains("000,0")){
            System.out.println("Assertion failed");
        } else if (neuralNetworkPlaygroundPage.epoch.getText().contains("000,1")) {
            System.out.println("Assertion failed");
        }else if (neuralNetworkPlaygroundPage.epoch.getText().contains("000,2")) {
            System.out.println("Assertion failed");
        }else if (neuralNetworkPlaygroundPage.epoch.getText().equals("000,300")) {
            System.out.println("Assertion failed");
        }else {
            System.out.println("Assertion passed");
        }


        BrowserUtils.sleep(3);

    }


    @And("user reports the last test loss value")
    public void userReportsTheLastTestLossValue() {
        System.out.println( "Last Test Loss Output" + neuralNetworkPlaygroundPage.lastTestLossOutput.getText());
        Assert.assertTrue(neuralNetworkPlaygroundPage.lastTestLossOutput.isDisplayed());
        BrowserUtils.sleep(5);
    }



}
