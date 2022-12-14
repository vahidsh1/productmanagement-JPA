
package external.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for permission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="permission"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="permissionID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="permissionTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "permission", propOrder = {
    "permissionID",
    "permissionTitle"
})
public class Permission {

    protected Long permissionID;
    protected String permissionTitle;

    /**
     * Gets the value of the permissionID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPermissionID() {
        return permissionID;
    }

    /**
     * Sets the value of the permissionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPermissionID(Long value) {
        this.permissionID = value;
    }

    /**
     * Gets the value of the permissionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionTitle() {
        return permissionTitle;
    }

    /**
     * Sets the value of the permissionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionTitle(String value) {
        this.permissionTitle = value;
    }

}
