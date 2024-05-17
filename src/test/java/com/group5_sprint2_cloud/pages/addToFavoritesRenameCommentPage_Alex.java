package com.group5_sprint2_cloud.pages;
import com.group5_sprint2_cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class addToFavoritesRenameCommentPage_Alex {
    public addToFavoritesRenameCommentPage_Alex(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

// add to favorite functionality
   @FindBy(xpath ="//td//span[@class='icon icon-more']")
  public  List<WebElement> threeDotsMenu;


  @FindBy(xpath ="//a[@class='menuitem action action-favorite permanent']")
  public WebElement addToFavotites;

    @FindBy(xpath = "//span[contains(@class, 'icon icon-starred')]")
    public WebElement isStarred;

    @FindBy(xpath = "//div[@class='thumbnail']")
    public List<WebElement> filesToBeAddedToFav;

    @FindBy(xpath = "//a[@class='nav-icon-favorites svg active']")
    public WebElement favoritesFiles;

    @FindBy(xpath = "//div/a[@class='button new']")
    public WebElement addNewFileButton;

    @FindBy(css = "#file_upload_start")
    public WebElement uploadButton;



    //rename functionality
  @FindBy(xpath =" //span[.='Rename']")
  public WebElement rename;

  @FindBy(xpath = "//span[@class='innernametext']")
    public List<WebElement> renameInput;

//comment functionality
  @FindBy(xpath =" //span[.='Details']")
    public WebElement details;

  @FindBy(xpath = "//a[@id='comments']")
      public WebElement comments;

  @FindBy(xpath = "//div[@placeholder = 'Write message, @ to mention someone …']")
          public WebElement commentInput;

  @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement commentSubmit;










}
