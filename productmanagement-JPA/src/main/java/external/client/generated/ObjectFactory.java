
package external.client.generated;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the external.client.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateRole_QNAME = new QName("http://controller.usermanagement.digipay.com/", "createRole");
    private final static QName _CreateRoleResponse_QNAME = new QName("http://controller.usermanagement.digipay.com/", "createRoleResponse");
    private final static QName _DeleteRole_QNAME = new QName("http://controller.usermanagement.digipay.com/", "deleteRole");
    private final static QName _DeleteRoleResponse_QNAME = new QName("http://controller.usermanagement.digipay.com/", "deleteRoleResponse");
    private final static QName _ListRoles_QNAME = new QName("http://controller.usermanagement.digipay.com/", "listRoles");
    private final static QName _ListRolesResponse_QNAME = new QName("http://controller.usermanagement.digipay.com/", "listRolesResponse");
    private final static QName _UpdateRole_QNAME = new QName("http://controller.usermanagement.digipay.com/", "updateRole");
    private final static QName _UpdateRoleResponse_QNAME = new QName("http://controller.usermanagement.digipay.com/", "updateRoleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: external.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateRole }
     * 
     */
    public CreateRole createCreateRole() {
        return new CreateRole();
    }

    /**
     * Create an instance of {@link CreateRoleResponse }
     * 
     */
    public CreateRoleResponse createCreateRoleResponse() {
        return new CreateRoleResponse();
    }

    /**
     * Create an instance of {@link DeleteRole }
     * 
     */
    public DeleteRole createDeleteRole() {
        return new DeleteRole();
    }

    /**
     * Create an instance of {@link DeleteRoleResponse }
     * 
     */
    public DeleteRoleResponse createDeleteRoleResponse() {
        return new DeleteRoleResponse();
    }

    /**
     * Create an instance of {@link ListRoles }
     * 
     */
    public ListRoles createListRoles() {
        return new ListRoles();
    }

    /**
     * Create an instance of {@link ListRolesResponse }
     * 
     */
    public ListRolesResponse createListRolesResponse() {
        return new ListRolesResponse();
    }

    /**
     * Create an instance of {@link UpdateRole }
     * 
     */
    public UpdateRole createUpdateRole() {
        return new UpdateRole();
    }

    /**
     * Create an instance of {@link UpdateRoleResponse }
     * 
     */
    public UpdateRoleResponse createUpdateRoleResponse() {
        return new UpdateRoleResponse();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link Permission }
     * 
     */
    public Permission createPermission() {
        return new Permission();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRole }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateRole }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.usermanagement.digipay.com/", name = "createRole")
    public JAXBElement<CreateRole> createCreateRole(CreateRole value) {
        return new JAXBElement<CreateRole>(_CreateRole_QNAME, CreateRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRoleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateRoleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.usermanagement.digipay.com/", name = "createRoleResponse")
    public JAXBElement<CreateRoleResponse> createCreateRoleResponse(CreateRoleResponse value) {
        return new JAXBElement<CreateRoleResponse>(_CreateRoleResponse_QNAME, CreateRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRole }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteRole }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.usermanagement.digipay.com/", name = "deleteRole")
    public JAXBElement<DeleteRole> createDeleteRole(DeleteRole value) {
        return new JAXBElement<DeleteRole>(_DeleteRole_QNAME, DeleteRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRoleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteRoleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.usermanagement.digipay.com/", name = "deleteRoleResponse")
    public JAXBElement<DeleteRoleResponse> createDeleteRoleResponse(DeleteRoleResponse value) {
        return new JAXBElement<DeleteRoleResponse>(_DeleteRoleResponse_QNAME, DeleteRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListRoles }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListRoles }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.usermanagement.digipay.com/", name = "listRoles")
    public JAXBElement<ListRoles> createListRoles(ListRoles value) {
        return new JAXBElement<ListRoles>(_ListRoles_QNAME, ListRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListRolesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListRolesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.usermanagement.digipay.com/", name = "listRolesResponse")
    public JAXBElement<ListRolesResponse> createListRolesResponse(ListRolesResponse value) {
        return new JAXBElement<ListRolesResponse>(_ListRolesResponse_QNAME, ListRolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRole }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateRole }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.usermanagement.digipay.com/", name = "updateRole")
    public JAXBElement<UpdateRole> createUpdateRole(UpdateRole value) {
        return new JAXBElement<UpdateRole>(_UpdateRole_QNAME, UpdateRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRoleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateRoleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.usermanagement.digipay.com/", name = "updateRoleResponse")
    public JAXBElement<UpdateRoleResponse> createUpdateRoleResponse(UpdateRoleResponse value) {
        return new JAXBElement<UpdateRoleResponse>(_UpdateRoleResponse_QNAME, UpdateRoleResponse.class, null, value);
    }

}
