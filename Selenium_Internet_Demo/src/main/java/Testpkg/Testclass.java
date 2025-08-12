package Testpkg;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Basepkg.Baseclass;
import Pagepkg.ABtesting;

public class Testclass extends Baseclass {
	ABtesting abTestPage;

    @BeforeClass
    public void setupPage() {
        abTestPage = new ABtesting(driver);
    }

    @Test(priority = 1)
    public void testABTestPage() throws Exception {
        abTestPage.ABtest();;
    }

    @Test(priority = 2)
    public void testAddRemoveElements() {
        abTestPage.addremove();;
    }

    @Test(priority = 3)
    public void testBasicAuth() throws Exception {
        abTestPage.basic_auth();
    }

    @Test(priority = 4)
    public void testBrokenImages() {
        abTestPage.broken_img();
    }

    @Test(priority = 5)
    public void testRichTextEditor() {
        abTestPage.Editor();
    }

    @Test(priority = 6)
    public void testTyposPage() {
        abTestPage.typos();
    }

    @Test(priority = 7)
    public void testStatusCodes() throws Exception{
        abTestPage.status_code();
    }

    @Test(priority = 8)
    public void testCheckboxes() {
        abTestPage.checkbox();
    }

    @Test(priority = 9)
    public void testContextMenu() {
        abTestPage.contextmenu();
    }

    @Test(priority = 10)
    public void testDirectAuth() throws Exception {
        abTestPage.directauth();
    }

    @Test(priority = 11)
    public void testDragAndDrop() {
        abTestPage.dragdrop();
    }

    @Test(priority = 12)
    public void testDropdown() {
        abTestPage.dropdown();
    }

    @Test(priority = 13)
    public void testDynamicControls() throws Exception {
        abTestPage.dynamic_control();
    }

    @Test(priority = 14)
    public void testDynamicLoading() throws Exception {
        abTestPage.dynamic_load();
    }

    @Test(priority = 15)
    public void testFileDownload() {
        abTestPage.download();
    }

    @Test(priority = 16)
    public void testFileUpload() throws Exception {
        abTestPage.upload();
    }

    @Test(priority = 17)
    public void testFormAuthentication() throws Exception {
        abTestPage.formauth();
    }

    @Test(priority = 18)
    public void testSlider() throws Exception {
        abTestPage.slider();
    }

    @Test(priority = 19)
    public void testHoverTooltips() {
        abTestPage.hover();
    }

    @Test(priority = 20)
    public void testInputField() {
        abTestPage.input();
    }

    @Test(priority = 21)
    public void testJQueryUI() throws Exception {
        abTestPage.jqueryui();
    }

    @Test(priority = 22)
    public void testJavaScriptAlerts() {
        abTestPage.javascriptquery();
    }

    @Test(priority = 23)
    public void testKeyPresses() throws Exception {
        abTestPage.keypress();
    }

    @Test(priority = 24)
    public void testMultipleWindows() {
        abTestPage.Mulwindow();
    }
}
