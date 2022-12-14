package com.NeuralNetworkPlaygroundProject.pages;

import com.NeuralNetworkPlaygroundProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeuralNetworkPlaygroundPage {
    public NeuralNetworkPlaygroundPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='output-stats ui-percTrainData']")
    public WebElement TestLossOutput;

    @FindBy(xpath = "(//canvas[@class='data-thumbnail'])[1]")
    public WebElement chooseDataset;

    @FindBy(xpath = "(//canvas[@class=\"data-thumbnail selected\"])[1]")
    public WebElement selectedDataset;

    @FindBy(xpath = "(//div[@class='mdl-slider__background-lower'])[2]")
    public WebElement noiseButton;

    @FindBy(xpath = "//span[.='5']")
    public WebElement noise5;
    @FindBy(xpath = "(//canvas[@style='width: 30px; height: 30px; position: absolute; top: 0px; left: 0px;'])[11]")
    public WebElement feature3;

    @FindBy(xpath = "(//canvas[@style='width: 30px; height: 30px; position: absolute; top: 0px; left: 0px;'])[10]")
    public WebElement feature4;


    @FindBy(xpath = "//div[.='4 neurons']")
    public WebElement FirstnumberOfNeurens;
    @FindBy(xpath = "(//i[.='remove'])[1]")
    public WebElement removeNeuronD;

    @FindBy(xpath = "//div[.='3 neurons']")
    public WebElement FirstNumberOfNeurensAfterRemove;

    @FindBy(xpath = "(//canvas[@style='width: 30px; height: 30px; position: absolute; top: 0px; left: 0px;'])[3]")
    public WebElement removedNeuronD;

    @FindBy(xpath = "//div[.='2 neurons']")
    public WebElement SecondnumberOfNeurens;
    @FindBy(xpath = "(//i[.='remove'])[2]")
    public WebElement removeNeuronE;

    @FindBy(xpath = "//div[.='1 neuron']")
    public WebElement SecondNumberOfNeurensAfterRemove;

    @FindBy(xpath = "(//canvas[@style='width: 30px; height: 30px; position: absolute; top: 0px; left: 0px;'])[1]")
    public WebElement removedNeuronE;

    @FindBy(xpath = "//select[@id='learningRate']")
    public WebElement sellectLearningRateBttn;

    @FindBy(xpath = "//select[@id='learningRate']")
    public WebElement LearningRate;

    @FindBy(xpath = "(//option)[7]")
    public WebElement newLearningRate;

    @FindBy(xpath = "//i[.='play_arrow']")
    public WebElement runSimulation;


    @FindBy(xpath = "//i[.='pause']")
    public WebElement pauseSimulation;

    @FindBy(xpath = "//span[@id='iter-number']")
    public WebElement epoch;

    @FindBy(xpath = "//div[@class='output-stats ui-percTrainData']")
    public WebElement lastTestLossOutput;








}
