package FamousOperas;

import java.util.Objects;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * OperasGUI.java
 * A class representing the GUI used in a maintaining the opera database
 * <pre>
 *    Project	FamousOperas
 *    Platform	jdk 1.8.0_241; NetBeans IDE 11.3; Windows 10
 *    Course	CS 142, EdCC
 *    Hourse	1 hours and 45 minutes
 *    Created	1/8/2021
 * </pre>
 *
 * @author:		<i>Leanne Vu</i>
 * @version: 	%1% %5%
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class Operas {
    
    private String name;
    private String composer;
    private int years;
    private String city;
    private String synopsis;
    private String link;
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Constructor   Operas() -default constructor
    * Description   Creates an instance of the city class and assign default
    *               values.
    * @author       <i>Leanne Vu</i>	
    * Date          1/26/2021
    *</pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Operas(){
        name = "";
        composer = "";
        years = 0;
        city = "";
        synopsis = ""; 
        link = "";
    }
    
        /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor      Operas()-overloaded constructor
     * Description      Create an instance of the Operas() class and assign
     *                  values via parameters to all fields.
     * @author          <i>Leanne Vu</i>
     * @param           name String
     * @param           composer String
     * @param           city String
     * @param           synopsis String
     * @param           link String
     * @param           years int
     * Date             1/26/2021
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Operas(String name, String composer, int years, String city, String synopsis, String link) {
        this.name = name;
        this.composer = composer;
        this.years = years;
        this.city = city;
        this.synopsis = synopsis;
        this.link = link;
    }
    
     /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Constructor   Opears() -overloaded copy constructor
    * Description   Create an instance of the Operas() class and assign
    *               values via parameters from another city to all fields.
    * @author       <i>Leanne Vu</i>	
    * @param        anotherOpera Operas
    * Date          1/26/2021
    *</pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Operas(Operas anotherOpera){
        name = anotherOpera.name;
        composer = anotherOpera.composer;
        years = anotherOpera.years;
        city = anotherOpera.city;
        synopsis = anotherOpera.synopsis;
        link = anotherOpera.link;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       getName()
     * Description  Get method to return variable name
     * @author      <i>Leanne Vu</i>
     * @return      name String
     * Date         1/27/2021
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public String getName() {
        return name;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       setname()
     * Description  Set method to set instance variable name
     * @author      <i>Leanne Vu</i>
     * @param       name String
     * Date         1/26/2021
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setName(String name) {
        this.name = name;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       getComposer()
     * Description  Get method to return variable composer
     * @author      <i>Leanne Vu</i>
     * @return      name String
     * Date         1/27/2021
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public String getComposer() {
        return composer;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       setComposer()
     * Description  Set method to set instance variable for composer
     * @author      <i>Leanne Vu</i>
     * @param       composer String
     * Date         1/27/2021
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setComposer(String composer) {
        this.composer = composer;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       getYears()
     * Description  Get method to return variable year
     * @author      <i>Leanne Vu</i>
     * @return      name String
     * Date         1/27/2021
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public int getYears() {
        return years;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       setYear()
     * Description  Set method to set instance variable year
     * @author      <i>Leanne Vu</i>
     * @param       years int
     * Date         1/26/2021
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setYears(int years) {
        this.years = years;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       getCity()
     * Description  Get method to return variable city
     * @author      <i>Leanne Vu</i>
     * @return      name String
     * Date         1/26/2021
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public String getCity() {
        return city;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       setCity()
     * Description  Set method to set instance variable city
     * @author      <i>Leanne Vu</i>
     * @param       city String
     * Date         1/26/2021
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setCity(String city) {
        this.city = city;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       getSynopsis()
     * Description  Get method to return variable Synopsis
     * @author      <i>Leanne Vu</i>
     * @return      name String
     * Date         1/26/2021
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public String getSynopsis() {
        return synopsis;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       setSynopsis()
     * Description  Set method to set instance variable synopsis
     * @author      <i>Leanne Vu</i>
     * @param       synopsis String
     * Date         1/26/2021
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       getLink()
     * Description  Get method to return variable link
     * @author      <i>Leanne Vu</i>
     * @return      name String
     * Date         1/26/2021
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public String getLink() {
        return link;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       setLink()
     * Description  Set method to set instance variable link
     * @author      <i>Leanne Vu</i>
     * @param       link String
     * Date         1/26/2021
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setLink(String link) {
        this.link = link;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       toString()
     * Description  Override toString() method to display Composers object
     * @author      <i>Leanne Vu</i>
     * @return       object String
     * Date         1/26/2021
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    @Override
    public String toString() {
        return "Opera name: "  + name + "\nComposer: " + composer
                + "\nYears: " + years + "\nCity where first performed: " + city + 
                "\nSynopsis: " + synopsis + "\n YouTube link: " + link ;
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       equals()
     * Description  Override equals() method to compare Opera object equals to another
     * @author      <i>Leanne Vu</i>
     * @param       obj Object
     * @return      true or false boolean
     * Date       1/26/2021
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Operas other = (Operas) obj;
        if (this.years != other.years) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.composer, other.composer)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.synopsis, other.synopsis)) {
            return false;
        }
        if (!Objects.equals(this.link, other.link)) {
            return false;
        }
        return true;
    }

    
}
