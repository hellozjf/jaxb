//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.09.29 ʱ�� 08:15:19 PM CST 
//


package com.hellozjf.test.jaxb.Fitem;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="fitem" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="structure" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="field" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="citem_sqr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="cfield_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="ctext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="imode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="itype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="ilength" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="iscale" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="blist" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="bsum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="bref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="isubitem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="idefine" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="bprimarykey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="isource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="ctablename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="cfieldname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="iwidth" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="ialign" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="itemclass" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="citemccode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="citemcname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="iitemcgrade" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="bitemcend" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="citem_class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="citem_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="citem_text" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="crule" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="roottag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="docid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="proc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="billtype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="receiver" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sender" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeexchanged" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="exportneedexch" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fitem"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    protected List<Ufinterface.Fitem> fitem;
    @XmlAttribute(name = "roottag")
    protected String roottag;
    @XmlAttribute(name = "docid")
    protected String docid;
    @XmlAttribute(name = "proc")
    protected String proc;
    @XmlAttribute(name = "billtype")
    protected String billtype;
    @XmlAttribute(name = "receiver")
    protected String receiver;
    @XmlAttribute(name = "sender")
    protected String sender;
    @XmlAttribute(name = "codeexchanged")
    protected String codeexchanged;
    @XmlAttribute(name = "exportneedexch")
    protected String exportneedexch;

    /**
     * Gets the value of the fitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFitem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Fitem }
     * 
     * 
     */
    public List<Ufinterface.Fitem> getFitem() {
        if (fitem == null) {
            fitem = new ArrayList<Ufinterface.Fitem>();
        }
        return this.fitem;
    }

    /**
     * ��ȡroottag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoottag() {
        return roottag;
    }

    /**
     * ����roottag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoottag(String value) {
        this.roottag = value;
    }

    /**
     * ��ȡdocid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocid() {
        return docid;
    }

    /**
     * ����docid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocid(String value) {
        this.docid = value;
    }

    /**
     * ��ȡproc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProc() {
        return proc;
    }

    /**
     * ����proc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProc(String value) {
        this.proc = value;
    }

    /**
     * ��ȡbilltype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilltype() {
        return billtype;
    }

    /**
     * ����billtype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilltype(String value) {
        this.billtype = value;
    }

    /**
     * ��ȡreceiver���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * ����receiver���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiver(String value) {
        this.receiver = value;
    }

    /**
     * ��ȡsender���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * ����sender���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * ��ȡcodeexchanged���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeexchanged() {
        return codeexchanged;
    }

    /**
     * ����codeexchanged���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeexchanged(String value) {
        this.codeexchanged = value;
    }

    /**
     * ��ȡexportneedexch���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportneedexch() {
        return exportneedexch;
    }

    /**
     * ����exportneedexch���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportneedexch(String value) {
        this.exportneedexch = value;
    }


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
     *         &lt;element name="structure" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="field" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="citem_sqr" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="cfield_name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="ctext" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="imode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="itype" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="ilength" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="iscale" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="blist" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="bsum" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="bref" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="isubitem" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="idefine" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="bprimarykey" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="isource" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="ctablename" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="cfieldname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="iwidth" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="ialign" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="itemclass" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="citemccode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="citemcname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="iitemcgrade" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="bitemcend" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="citem_class" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="citem_name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="citem_text" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="crule" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "structure",
        "itemclass"
    })
    public static class Fitem {

        protected List<Ufinterface.Fitem.Structure> structure;
        protected List<Ufinterface.Fitem.Itemclass> itemclass;
        @XmlAttribute(name = "citem_class")
        protected String citemClass;
        @XmlAttribute(name = "citem_name")
        protected String citemName;
        @XmlAttribute(name = "citem_text")
        protected String citemText;
        @XmlAttribute(name = "crule")
        protected String crule;

        /**
         * Gets the value of the structure property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the structure property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStructure().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ufinterface.Fitem.Structure }
         * 
         * 
         */
        public List<Ufinterface.Fitem.Structure> getStructure() {
            if (structure == null) {
                structure = new ArrayList<Ufinterface.Fitem.Structure>();
            }
            return this.structure;
        }

        /**
         * Gets the value of the itemclass property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemclass property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemclass().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ufinterface.Fitem.Itemclass }
         * 
         * 
         */
        public List<Ufinterface.Fitem.Itemclass> getItemclass() {
            if (itemclass == null) {
                itemclass = new ArrayList<Ufinterface.Fitem.Itemclass>();
            }
            return this.itemclass;
        }

        /**
         * ��ȡcitemClass���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCitemClass() {
            return citemClass;
        }

        /**
         * ����citemClass���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCitemClass(String value) {
            this.citemClass = value;
        }

        /**
         * ��ȡcitemName���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCitemName() {
            return citemName;
        }

        /**
         * ����citemName���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCitemName(String value) {
            this.citemName = value;
        }

        /**
         * ��ȡcitemText���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCitemText() {
            return citemText;
        }

        /**
         * ����citemText���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCitemText(String value) {
            this.citemText = value;
        }

        /**
         * ��ȡcrule���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrule() {
            return crule;
        }

        /**
         * ����crule���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrule(String value) {
            this.crule = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="citemccode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="citemcname" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="iitemcgrade" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="bitemcend" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Itemclass {

            @XmlAttribute(name = "citemccode")
            protected String citemccode;
            @XmlAttribute(name = "citemcname")
            protected String citemcname;
            @XmlAttribute(name = "iitemcgrade")
            protected String iitemcgrade;
            @XmlAttribute(name = "bitemcend")
            protected String bitemcend;

            /**
             * ��ȡcitemccode���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCitemccode() {
                return citemccode;
            }

            /**
             * ����citemccode���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCitemccode(String value) {
                this.citemccode = value;
            }

            /**
             * ��ȡcitemcname���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCitemcname() {
                return citemcname;
            }

            /**
             * ����citemcname���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCitemcname(String value) {
                this.citemcname = value;
            }

            /**
             * ��ȡiitemcgrade���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIitemcgrade() {
                return iitemcgrade;
            }

            /**
             * ����iitemcgrade���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIitemcgrade(String value) {
                this.iitemcgrade = value;
            }

            /**
             * ��ȡbitemcend���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBitemcend() {
                return bitemcend;
            }

            /**
             * ����bitemcend���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBitemcend(String value) {
                this.bitemcend = value;
            }

        }


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
         *         &lt;element name="field" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="citem_sqr" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="cfield_name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="ctext" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="imode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="itype" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="ilength" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="iscale" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="blist" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="bsum" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="bref" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="isubitem" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="idefine" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="bprimarykey" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="isource" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="ctablename" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="cfieldname" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="iwidth" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="ialign" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "field"
        })
        public static class Structure {

            protected List<Ufinterface.Fitem.Structure.Field> field;

            /**
             * Gets the value of the field property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the field property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getField().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Ufinterface.Fitem.Structure.Field }
             * 
             * 
             */
            public List<Ufinterface.Fitem.Structure.Field> getField() {
                if (field == null) {
                    field = new ArrayList<Ufinterface.Fitem.Structure.Field>();
                }
                return this.field;
            }


            /**
             * <p>anonymous complex type�� Java �ࡣ
             * 
             * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="citem_sqr" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="cfield_name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="ctext" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="imode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="itype" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="ilength" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="iscale" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="blist" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="bsum" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="bref" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="isubitem" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="idefine" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="bprimarykey" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="isource" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="ctablename" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="cfieldname" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="iwidth" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="ialign" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Field {

                @XmlAttribute(name = "citem_sqr")
                protected String citemSqr;
                @XmlAttribute(name = "cfield_name")
                protected String cfieldName;
                @XmlAttribute(name = "ctext")
                protected String ctext;
                @XmlAttribute(name = "imode")
                protected String imode;
                @XmlAttribute(name = "itype")
                protected String itype;
                @XmlAttribute(name = "ilength")
                protected String ilength;
                @XmlAttribute(name = "iscale")
                protected String iscale;
                @XmlAttribute(name = "blist")
                protected String blist;
                @XmlAttribute(name = "bsum")
                protected String bsum;
                @XmlAttribute(name = "bref")
                protected String bref;
                @XmlAttribute(name = "isubitem")
                protected String isubitem;
                @XmlAttribute(name = "idefine")
                protected String idefine;
                @XmlAttribute(name = "bprimarykey")
                protected String bprimarykey;
                @XmlAttribute(name = "isource")
                protected String isource;
                @XmlAttribute(name = "ctablename")
                protected String ctablename;
                @XmlAttribute(name = "cfieldname")
                protected String cfieldname;
                @XmlAttribute(name = "iwidth")
                protected String iwidth;
                @XmlAttribute(name = "ialign")
                protected String ialign;

                /**
                 * ��ȡcitemSqr���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCitemSqr() {
                    return citemSqr;
                }

                /**
                 * ����citemSqr���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCitemSqr(String value) {
                    this.citemSqr = value;
                }

                /**
                 * ��ȡcfieldName���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCfieldName() {
                    return cfieldName;
                }

                /**
                 * ����cfieldName���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCfieldName(String value) {
                    this.cfieldName = value;
                }

                /**
                 * ��ȡctext���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCtext() {
                    return ctext;
                }

                /**
                 * ����ctext���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCtext(String value) {
                    this.ctext = value;
                }

                /**
                 * ��ȡimode���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getImode() {
                    return imode;
                }

                /**
                 * ����imode���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setImode(String value) {
                    this.imode = value;
                }

                /**
                 * ��ȡitype���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItype() {
                    return itype;
                }

                /**
                 * ����itype���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItype(String value) {
                    this.itype = value;
                }

                /**
                 * ��ȡilength���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIlength() {
                    return ilength;
                }

                /**
                 * ����ilength���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIlength(String value) {
                    this.ilength = value;
                }

                /**
                 * ��ȡiscale���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIscale() {
                    return iscale;
                }

                /**
                 * ����iscale���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIscale(String value) {
                    this.iscale = value;
                }

                /**
                 * ��ȡblist���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBlist() {
                    return blist;
                }

                /**
                 * ����blist���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBlist(String value) {
                    this.blist = value;
                }

                /**
                 * ��ȡbsum���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBsum() {
                    return bsum;
                }

                /**
                 * ����bsum���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBsum(String value) {
                    this.bsum = value;
                }

                /**
                 * ��ȡbref���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBref() {
                    return bref;
                }

                /**
                 * ����bref���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBref(String value) {
                    this.bref = value;
                }

                /**
                 * ��ȡisubitem���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsubitem() {
                    return isubitem;
                }

                /**
                 * ����isubitem���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsubitem(String value) {
                    this.isubitem = value;
                }

                /**
                 * ��ȡidefine���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIdefine() {
                    return idefine;
                }

                /**
                 * ����idefine���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIdefine(String value) {
                    this.idefine = value;
                }

                /**
                 * ��ȡbprimarykey���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBprimarykey() {
                    return bprimarykey;
                }

                /**
                 * ����bprimarykey���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBprimarykey(String value) {
                    this.bprimarykey = value;
                }

                /**
                 * ��ȡisource���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsource() {
                    return isource;
                }

                /**
                 * ����isource���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsource(String value) {
                    this.isource = value;
                }

                /**
                 * ��ȡctablename���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCtablename() {
                    return ctablename;
                }

                /**
                 * ����ctablename���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCtablename(String value) {
                    this.ctablename = value;
                }

                /**
                 * ��ȡcfieldname���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCfieldname() {
                    return cfieldname;
                }

                /**
                 * ����cfieldname���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCfieldname(String value) {
                    this.cfieldname = value;
                }

                /**
                 * ��ȡiwidth���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIwidth() {
                    return iwidth;
                }

                /**
                 * ����iwidth���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIwidth(String value) {
                    this.iwidth = value;
                }

                /**
                 * ��ȡialign���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIalign() {
                    return ialign;
                }

                /**
                 * ����ialign���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIalign(String value) {
                    this.ialign = value;
                }

            }

        }

    }

}
