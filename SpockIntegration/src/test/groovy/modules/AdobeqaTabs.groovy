package modules

import geb.Module

class AdobeqaTabs extends Module {
 static content = {
     aboutUs(wait: true){$("#mainnav-menu > li.page_item.page-item-2 > a")}
 }

     def "Click on Adobeqa --> AboutUs tab"(){
        aboutUs.click()
    }
}
