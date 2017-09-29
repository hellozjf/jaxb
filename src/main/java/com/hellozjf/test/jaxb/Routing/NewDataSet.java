//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.09.29 ʱ�� 08:15:41 PM CST 
//


package com.hellozjf.test.jaxb.Routing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}Version"/>
 *         &lt;element ref="{}ufinterface"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "versionOrUfinterface"
})
@XmlRootElement(name = "NewDataSet")
public class NewDataSet {

    @XmlElements({
        @XmlElement(name = "Version", type = Version.class),
        @XmlElement(name = "ufinterface", type = Ufinterface.class)
    })
    protected List<Object> versionOrUfinterface;

    /**
     * Gets the value of the versionOrUfinterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the versionOrUfinterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersionOrUfinterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Version }
     * {@link Ufinterface }
     * 
     * 
     */
    public List<Object> getVersionOrUfinterface() {
        if (versionOrUfinterface == null) {
            versionOrUfinterface = new ArrayList<Object>();
        }
        return this.versionOrUfinterface;
    }

}
