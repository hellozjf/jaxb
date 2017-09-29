//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.09.29 ʱ�� 08:14:56 PM CST 
//


package com.hellozjf.test.jaxb.Bom;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element name="BomId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VersionDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VersionEffDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdentDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}Version" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bomId",
    "bomType",
    "versionDesc",
    "versionEffDate",
    "identCode",
    "identDesc",
    "define1",
    "define2",
    "define3",
    "define4",
    "define5",
    "define6",
    "define7",
    "define8",
    "define9",
    "define10",
    "define11",
    "define12",
    "define13",
    "define14",
    "define15",
    "define16",
    "status",
    "version"
})
@XmlRootElement(name = "Version")
public class Version {

    @XmlElement(name = "BomId")
    protected String bomId;
    @XmlElement(name = "BomType")
    protected String bomType;
    @XmlElement(name = "VersionDesc")
    protected String versionDesc;
    @XmlElement(name = "VersionEffDate")
    protected String versionEffDate;
    @XmlElement(name = "IdentCode")
    protected String identCode;
    @XmlElement(name = "IdentDesc")
    protected String identDesc;
    @XmlElement(name = "Define1")
    protected String define1;
    @XmlElement(name = "Define2")
    protected String define2;
    @XmlElement(name = "Define3")
    protected String define3;
    @XmlElement(name = "Define4")
    protected String define4;
    @XmlElement(name = "Define5")
    protected String define5;
    @XmlElement(name = "Define6")
    protected String define6;
    @XmlElement(name = "Define7")
    protected String define7;
    @XmlElement(name = "Define8")
    protected String define8;
    @XmlElement(name = "Define9")
    protected String define9;
    @XmlElement(name = "Define10")
    protected String define10;
    @XmlElement(name = "Define11")
    protected String define11;
    @XmlElement(name = "Define12")
    protected String define12;
    @XmlElement(name = "Define13")
    protected String define13;
    @XmlElement(name = "Define14")
    protected String define14;
    @XmlElement(name = "Define15")
    protected String define15;
    @XmlElement(name = "Define16")
    protected String define16;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Version")
    protected List<Version> version;

    /**
     * ��ȡbomId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBomId() {
        return bomId;
    }

    /**
     * ����bomId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBomId(String value) {
        this.bomId = value;
    }

    /**
     * ��ȡbomType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBomType() {
        return bomType;
    }

    /**
     * ����bomType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBomType(String value) {
        this.bomType = value;
    }

    /**
     * ��ȡversionDesc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionDesc() {
        return versionDesc;
    }

    /**
     * ����versionDesc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionDesc(String value) {
        this.versionDesc = value;
    }

    /**
     * ��ȡversionEffDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionEffDate() {
        return versionEffDate;
    }

    /**
     * ����versionEffDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionEffDate(String value) {
        this.versionEffDate = value;
    }

    /**
     * ��ȡidentCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentCode() {
        return identCode;
    }

    /**
     * ����identCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentCode(String value) {
        this.identCode = value;
    }

    /**
     * ��ȡidentDesc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentDesc() {
        return identDesc;
    }

    /**
     * ����identDesc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentDesc(String value) {
        this.identDesc = value;
    }

    /**
     * ��ȡdefine1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefine1() {
        return define1;
    }

    /**
     * ����define1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefine1(String value) {
        this.define1 = value;
    }

    /**
     * ��ȡdefine2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefine2() {
        return define2;
    }

    /**
     * ����define2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefine2(String value) {
        this.define2 = value;
    }

    /**
     * ��ȡdefine3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefine3() {
        return define3;
    }

    /**
     * ����define3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefine3(String value) {
        this.define3 = value;
    }

    /**
     * ��ȡdefine4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefine4() {
        return define4;
    }

    /**
     * ����define4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefine4(String value) {
        this.define4 = value;
    }

    /**
     * ��ȡdefine5���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefine5() {
        return define5;
    }

    /**
     * ����define5���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefine5(String value) {
        this.define5 = value;
    }

    /**
     * ��ȡdefine6���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefine6() {
        return define6;
    }

    /**
     * ����define6���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefine6(String value) {
        this.define6 = value;
    }

    /**
     * ��ȡdefine7���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefine7() {
        return define7;
    }

    /**
     * ����define7���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefine7(String value) {
        this.define7 = value;
    }

    /**
     * ��ȡdefine8���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefine8() {
        return define8;
    }

    /**
     * ����define8���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefine8(String value) {
        this.define8 = value;
    }

    /**
     * ��ȡdefine9���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefine9() {
        return define9;
    }

    /**
     * ����define9���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefine9(String value) {
        this.define9 = value;
    }

    /**
     * ��ȡdefine10���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefine10() {
        return define10;
    }

    /**
     * ����define10���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefine10(String value) {
        this.define10 = value;
    }

    /**
     * ��ȡdefine11���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefine11() {
        return define11;
    }

    /**
     * ����define11���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefine11(String value) {
        this.define11 = value;
    }

    /**
     * ��ȡdefine12���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefine12() {
        return define12;
    }

    /**
     * ����define12���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefine12(String value) {
        this.define12 = value;
    }

    /**
     * ��ȡdefine13���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefine13() {
        return define13;
    }

    /**
     * ����define13���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefine13(String value) {
        this.define13 = value;
    }

    /**
     * ��ȡdefine14���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefine14() {
        return define14;
    }

    /**
     * ����define14���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefine14(String value) {
        this.define14 = value;
    }

    /**
     * ��ȡdefine15���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefine15() {
        return define15;
    }

    /**
     * ����define15���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefine15(String value) {
        this.define15 = value;
    }

    /**
     * ��ȡdefine16���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefine16() {
        return define16;
    }

    /**
     * ����define16���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefine16(String value) {
        this.define16 = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the version property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Version }
     * 
     * 
     */
    public List<Version> getVersion() {
        if (version == null) {
            version = new ArrayList<Version>();
        }
        return this.version;
    }

}
