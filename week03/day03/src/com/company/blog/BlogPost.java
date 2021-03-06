package com.company.blog;

public class BlogPost {

    String authorName;
    String title;
    String text;
    String publicationDate;


    public BlogPost(String authorName, String title, String text, String publicationDate) {


        this.authorName = authorName;
        this.text = text;
        this.title = title;
        this.publicationDate = publicationDate;
    }

    public static void main(String[] args) {

        Blog blog9 = new Blog();

        BlogPost LoremIpsum = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet", "2000.05.04");
        BlogPost WaitButWhy = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything", "2000.10.10");
        BlogPost OneEngineer = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28");

        blog9.addPosts(LoremIpsum);
        blog9.addPosts(WaitButWhy);
        blog9.addPosts(OneEngineer);

        System.out.println(blog9.bloglist.get(0).authorName);

    }



}

