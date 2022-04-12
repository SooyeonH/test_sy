package com.javalec.team.dto;

public class ReviewlistDetail_dto {
   
   
   
    String rTitle;
    String user_uId;
    String rDate;
    String rImg;
    String rContent;
    
    ////////////////////////////////
    
    public ReviewlistDetail_dto() {
      
   }

    
   public ReviewlistDetail_dto(String rTitle, String user_uId, String rDate, String rImg, String rContent) {
      super();
      this.rTitle = rTitle;
      this.user_uId = user_uId;
      this.rDate = rDate;
      this.rImg = rImg;
      this.rContent = rContent;
   }


   
   /////////////////////////

   public String getrTitle() {
      return rTitle;
   }



   public void setrTitle(String rTitle) {
      this.rTitle = rTitle;
   }



   public String getUser_uId() {
      return user_uId;
   }



   public void setUser_uId(String user_uId) {
      this.user_uId = user_uId;
   }



   public String getrDate() {
      return rDate;
   }



   public void setrDate(String rDate) {
      this.rDate = rDate;
   }



   public String getrImg() {
      return rImg;
   }



   public void setrImg(String rImg) {
      this.rImg = rImg;
   }



   public String getrContent() {
      return rContent;
   }



   public void setrContent(String rContent) {
      this.rContent = rContent;
   }
    
    
    
   
   
   
    
}