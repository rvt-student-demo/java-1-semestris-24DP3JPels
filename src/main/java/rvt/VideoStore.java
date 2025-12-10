package rvt;


class Video
{
  private String  title;    // name of the item
  private int     length;   // number of minutes
  private boolean avail;    // is the video in the store?

  // constructor
  public Video( String ttl )
  {
    title = ttl; length = 90; avail = true; 
  }

  // constructor
  public Video( String ttl, int lngth )
  {
    title = ttl; length = lngth; avail = true; 
  }

  public String toString()
  {
    return title + ", " + length + " min. available:" + avail ;
  }
  
  public String getTitle() { return title; }
  public void setTitle( String ttl ) { title = ttl; }
  public int getLength() { return length; }
  public void setLength( int lng ) { length = lng; }
  public boolean getAvailable() { return avail;}
  public void setAvailable( boolean avl ) { avail = avl;}
}

public class VideoStore
{
  public static void main ( String args[] )
  {
    Video item1 = new Video("Jaws", 120 );
    Video item2 = new Video("Star Wars" );

    System.out.println( item1.toString() );
    System.out.println( item2.toString() );     
  }
}