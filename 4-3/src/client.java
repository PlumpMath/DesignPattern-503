public class client {

      public static void main(String[] args) {
            Institution bjHeadquarters,hnSubSchool,csTeachingPost,xtTeachingPost;
            Unit tOffice1, tOffice2, tOffice3, tOffice4,aOffice1,aOffice2,aOffice3,aOffice4;
            bjHeadquarters = new Institution("北京总部");
            hnSubSchool = new Institution("湖南分校");
            csTeachingPost = new Institution("长沙教学点");
            xtTeachingPost = new Institution("湘潭教学点");
            tOffice1 = new office("北京教务办公室");
            tOffice2 = new office("湖南教务办公室");
            tOffice3 = new office("长沙教务办公室");
            tOffice4 = new office("湘潭教务办公室");
            aOffice1 = new office("北京行政办公室");
            aOffice2 = new office("湖南行政办公室");
            aOffice3 = new office("长沙行政办公室");
            aOffice4 = new office("湘潭行政办公室");
            csTeachingPost.add(tOffice3);
            csTeachingPost.add(aOffice3);
            xtTeachingPost.add(tOffice4);
            xtTeachingPost.add(aOffice4);
            hnSubSchool.add(csTeachingPost);
            hnSubSchool.add(xtTeachingPost);
            hnSubSchool.add(tOffice2);
            hnSubSchool.add(aOffice2);
            bjHeadquarters.add(hnSubSchool);
            bjHeadquarters.add(tOffice1);
            bjHeadquarters.add(aOffice1);
            bjHeadquarters.handleArchives();
            
      }

}
