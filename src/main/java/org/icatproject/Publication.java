
package org.icatproject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for publication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="publication">
 *   &lt;complexContent>
 *     &lt;extension base="{http://icatproject.org}entityBaseBean">
 *       &lt;sequence>
 *         &lt;element name="doi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fullReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="investigation" type="{http://icatproject.org}investigation" minOccurs="0"/>
 *         &lt;element name="repository" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="repositoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "publication", propOrder = {
    "doi",
    "fullReference",
    "investigation",
    "repository",
    "repositoryId",
    "url"
})
public class Publication
    extends EntityBaseBean
{

    protected String doi;
    protected String fullReference;
    protected Investigation investigation;
    protected String repository;
    protected String repositoryId;
    protected String url;

    /**
     * Gets the value of the doi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoi() {
        return doi;
    }

    /**
     * Sets the value of the doi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoi(String value) {
        this.doi = value;
    }

    /**
     * Gets the value of the fullReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullReference() {
        return fullReference;
    }

    /**
     * Sets the value of the fullReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullReference(String value) {
        this.fullReference = value;
    }

    /**
     * Gets the value of the investigation property.
     * 
     * @return
     *     possible object is
     *     {@link Investigation }
     *     
     */
    public Investigation getInvestigation() {
        return investigation;
    }

    /**
     * Sets the value of the investigation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Investigation }
     *     
     */
    public void setInvestigation(Investigation value) {
        this.investigation = value;
    }

    /**
     * Gets the value of the repository property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepository() {
        return repository;
    }

    /**
     * Sets the value of the repository property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepository(String value) {
        this.repository = value;
    }

    /**
     * Gets the value of the repositoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepositoryId() {
        return repositoryId;
    }

    /**
     * Sets the value of the repositoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepositoryId(String value) {
        this.repositoryId = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

}
