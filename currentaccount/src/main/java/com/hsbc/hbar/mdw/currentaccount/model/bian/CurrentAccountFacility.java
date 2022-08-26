package com.hsbc.hbar.mdw.currentaccount.model.bian;



import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;


import org.springframework.validation.annotation.Validated;

/**
 * CurrentAccountFacility
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-10T23:51:49.156Z[GMT]")

public class CurrentAccountFacility   {

@JsonProperty("ProductInstanceReference")
  private Object productInstanceReference = null;

  @JsonProperty("CurrentAccountNumber")
  private String currentAccountNumber = null;

  @JsonProperty("CustomerReference")
  private Object customerReference = null;

  @JsonProperty("BankBranchOrLocationReference")
  private Object bankBranchOrLocationReference = null;

  @JsonProperty("AccountType")
  private Object accountType = null;

  @JsonProperty("AccountCurrency")
  private String accountCurrency = null;

  @JsonProperty("TaxReference")
  private Object taxReference = null;

  @JsonProperty("EntitlementOptionDefinition")
  private String entitlementOptionDefinition = null;

  @JsonProperty("EntitlementOptionSetting")
  private String entitlementOptionSetting = null;

  @JsonProperty("RestrictionOptionDefinition")
  private String restrictionOptionDefinition = null;

  @JsonProperty("RestrictionOptionSetting")
  private String restrictionOptionSetting = null;

  @JsonProperty("Associations")
  private String associations = null;

  @JsonProperty("AssociationType")
  private String associationType = null;

  @JsonProperty("AssociationObligationOrEntitlement")
  private String associationObligationOrEntitlement = null;

  @JsonProperty("AssociationReference")
  private Object associationReference = null;

  @JsonProperty("LinkedAccounts")
  private String linkedAccounts = null;

  @JsonProperty("LinkType")
  private String linkType = null;

  @JsonProperty("AccountDetails")
  private String accountDetails = null;

  @JsonProperty("PositionLimits")
  private String positionLimits = null;

  @JsonProperty("PositionLimitType")
  private String positionLimitType = null;

  @JsonProperty("PositionLimitSettings")
  private String positionLimitSettings = null;

  @JsonProperty("PositionLimitValue")
  private String positionLimitValue = null;

  @JsonProperty("DateType")
  private String dateType = null;

  @JsonProperty("Date")
  private String date = null;

  public CurrentAccountFacility productInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
    return this;
  }

  /**
   * Get productInstanceReference
   * @return productInstanceReference
   **/
  @Schema(description = "")
  
    public Object getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }

  public CurrentAccountFacility currentAccountNumber(String currentAccountNumber) {
    this.currentAccountNumber = currentAccountNumber;
    return this;
  }

  /**
   * Get currentAccountNumber
   * @return currentAccountNumber
   **/
  @Schema(description = "")
  
    public String getCurrentAccountNumber() {
    return currentAccountNumber;
  }

  public void setCurrentAccountNumber(String currentAccountNumber) {
    this.currentAccountNumber = currentAccountNumber;
  }

  public CurrentAccountFacility customerReference(Object customerReference) {
    this.customerReference = customerReference;
    return this;
  }

  /**
   * Get customerReference
   * @return customerReference
   **/
  @Schema(description = "")
  
    public Object getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(Object customerReference) {
    this.customerReference = customerReference;
  }

  public CurrentAccountFacility bankBranchOrLocationReference(Object bankBranchOrLocationReference) {
    this.bankBranchOrLocationReference = bankBranchOrLocationReference;
    return this;
  }

  /**
   * Get bankBranchOrLocationReference
   * @return bankBranchOrLocationReference
   **/
  @Schema(description = "")
  
    public Object getBankBranchOrLocationReference() {
    return bankBranchOrLocationReference;
  }

  public void setBankBranchOrLocationReference(Object bankBranchOrLocationReference) {
    this.bankBranchOrLocationReference = bankBranchOrLocationReference;
  }

  public CurrentAccountFacility accountType(Object accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
   **/
  @Schema(description = "")
  
    public Object getAccountType() {
    return accountType;
  }

  public void setAccountType(Object accountType) {
    this.accountType = accountType;
  }

  public CurrentAccountFacility accountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
    return this;
  }

  /**
   * Get accountCurrency
   * @return accountCurrency
   **/
  @Schema(description = "")
  
    public String getAccountCurrency() {
    return accountCurrency;
  }

  public void setAccountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
  }

  public CurrentAccountFacility taxReference(Object taxReference) {
    this.taxReference = taxReference;
    return this;
  }

  /**
   * Get taxReference
   * @return taxReference
   **/
  @Schema(description = "")
  
    public Object getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(Object taxReference) {
    this.taxReference = taxReference;
  }

  public CurrentAccountFacility entitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
    return this;
  }

  /**
   * Get entitlementOptionDefinition
   * @return entitlementOptionDefinition
   **/
  @Schema(description = "")
  
    public String getEntitlementOptionDefinition() {
    return entitlementOptionDefinition;
  }

  public void setEntitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
  }

  public CurrentAccountFacility entitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
    return this;
  }

  /**
   * Get entitlementOptionSetting
   * @return entitlementOptionSetting
   **/
  @Schema(description = "")
  
    public String getEntitlementOptionSetting() {
    return entitlementOptionSetting;
  }

  public void setEntitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
  }

  public CurrentAccountFacility restrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
    return this;
  }

  /**
   * Get restrictionOptionDefinition
   * @return restrictionOptionDefinition
   **/
  @Schema(description = "")
  
    public String getRestrictionOptionDefinition() {
    return restrictionOptionDefinition;
  }

  public void setRestrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
  }

  public CurrentAccountFacility restrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
    return this;
  }

  /**
   * Get restrictionOptionSetting
   * @return restrictionOptionSetting
   **/
  @Schema(description = "")
  
    public String getRestrictionOptionSetting() {
    return restrictionOptionSetting;
  }

  public void setRestrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
  }

  public CurrentAccountFacility associations(String associations) {
    this.associations = associations;
    return this;
  }

  /**
   * Get associations
   * @return associations
   **/
  @Schema(description = "")
  
    public String getAssociations() {
    return associations;
  }

  public void setAssociations(String associations) {
    this.associations = associations;
  }

  public CurrentAccountFacility associationType(String associationType) {
    this.associationType = associationType;
    return this;
  }

  /**
   * Get associationType
   * @return associationType
   **/
  @Schema(description = "")
  
    public String getAssociationType() {
    return associationType;
  }

  public void setAssociationType(String associationType) {
    this.associationType = associationType;
  }

  public CurrentAccountFacility associationObligationOrEntitlement(String associationObligationOrEntitlement) {
    this.associationObligationOrEntitlement = associationObligationOrEntitlement;
    return this;
  }

  /**
   * Get associationObligationOrEntitlement
   * @return associationObligationOrEntitlement
   **/
  @Schema(description = "")
  
    public String getAssociationObligationOrEntitlement() {
    return associationObligationOrEntitlement;
  }

  public void setAssociationObligationOrEntitlement(String associationObligationOrEntitlement) {
    this.associationObligationOrEntitlement = associationObligationOrEntitlement;
  }

  public CurrentAccountFacility associationReference(Object associationReference) {
    this.associationReference = associationReference;
    return this;
  }

  /**
   * Get associationReference
   * @return associationReference
   **/
  @Schema(description = "")
  
    public Object getAssociationReference() {
    return associationReference;
  }

  public void setAssociationReference(Object associationReference) {
    this.associationReference = associationReference;
  }

  public CurrentAccountFacility linkedAccounts(String linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
    return this;
  }

  /**
   * Get linkedAccounts
   * @return linkedAccounts
   **/
  @Schema(description = "")
  
    public String getLinkedAccounts() {
    return linkedAccounts;
  }

  public void setLinkedAccounts(String linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
  }

  public CurrentAccountFacility linkType(String linkType) {
    this.linkType = linkType;
    return this;
  }

  /**
   * Get linkType
   * @return linkType
   **/
  @Schema(description = "")
  
    public String getLinkType() {
    return linkType;
  }

  public void setLinkType(String linkType) {
    this.linkType = linkType;
  }

  public CurrentAccountFacility accountDetails(String accountDetails) {
    this.accountDetails = accountDetails;
    return this;
  }

  /**
   * Get accountDetails
   * @return accountDetails
   **/
  @Schema(description = "")
  
    public String getAccountDetails() {
    return accountDetails;
  }

  public void setAccountDetails(String accountDetails) {
    this.accountDetails = accountDetails;
  }

  public CurrentAccountFacility positionLimits(String positionLimits) {
    this.positionLimits = positionLimits;
    return this;
  }

  /**
   * Get positionLimits
   * @return positionLimits
   **/
  @Schema(description = "")
  
    public String getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(String positionLimits) {
    this.positionLimits = positionLimits;
  }

  public CurrentAccountFacility positionLimitType(String positionLimitType) {
    this.positionLimitType = positionLimitType;
    return this;
  }

  /**
   * Get positionLimitType
   * @return positionLimitType
   **/
  @Schema(description = "")
  
    public String getPositionLimitType() {
    return positionLimitType;
  }

  public void setPositionLimitType(String positionLimitType) {
    this.positionLimitType = positionLimitType;
  }

  public CurrentAccountFacility positionLimitSettings(String positionLimitSettings) {
    this.positionLimitSettings = positionLimitSettings;
    return this;
  }

  /**
   * Get positionLimitSettings
   * @return positionLimitSettings
   **/
  @Schema(description = "")
  
    public String getPositionLimitSettings() {
    return positionLimitSettings;
  }

  public void setPositionLimitSettings(String positionLimitSettings) {
    this.positionLimitSettings = positionLimitSettings;
  }

  public CurrentAccountFacility positionLimitValue(String positionLimitValue) {
    this.positionLimitValue = positionLimitValue;
    return this;
  }

  /**
   * Get positionLimitValue
   * @return positionLimitValue
   **/
  @Schema(description = "")
  
    public String getPositionLimitValue() {
    return positionLimitValue;
  }

  public void setPositionLimitValue(String positionLimitValue) {
    this.positionLimitValue = positionLimitValue;
  }

  public CurrentAccountFacility dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   * Get dateType
   * @return dateType
   **/
  @Schema(description = "")
  
    public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }

  public CurrentAccountFacility date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   **/
  @Schema(description = "")
  
    public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentAccountFacility currentAccountFacility = (CurrentAccountFacility) o;
    return Objects.equals(this.productInstanceReference, currentAccountFacility.productInstanceReference) &&
        Objects.equals(this.currentAccountNumber, currentAccountFacility.currentAccountNumber) &&
        Objects.equals(this.customerReference, currentAccountFacility.customerReference) &&
        Objects.equals(this.bankBranchOrLocationReference, currentAccountFacility.bankBranchOrLocationReference) &&
        Objects.equals(this.accountType, currentAccountFacility.accountType) &&
        Objects.equals(this.accountCurrency, currentAccountFacility.accountCurrency) &&
        Objects.equals(this.taxReference, currentAccountFacility.taxReference) &&
        Objects.equals(this.entitlementOptionDefinition, currentAccountFacility.entitlementOptionDefinition) &&
        Objects.equals(this.entitlementOptionSetting, currentAccountFacility.entitlementOptionSetting) &&
        Objects.equals(this.restrictionOptionDefinition, currentAccountFacility.restrictionOptionDefinition) &&
        Objects.equals(this.restrictionOptionSetting, currentAccountFacility.restrictionOptionSetting) &&
        Objects.equals(this.associations, currentAccountFacility.associations) &&
        Objects.equals(this.associationType, currentAccountFacility.associationType) &&
        Objects.equals(this.associationObligationOrEntitlement, currentAccountFacility.associationObligationOrEntitlement) &&
        Objects.equals(this.associationReference, currentAccountFacility.associationReference) &&
        Objects.equals(this.linkedAccounts, currentAccountFacility.linkedAccounts) &&
        Objects.equals(this.linkType, currentAccountFacility.linkType) &&
        Objects.equals(this.accountDetails, currentAccountFacility.accountDetails) &&
        Objects.equals(this.positionLimits, currentAccountFacility.positionLimits) &&
        Objects.equals(this.positionLimitType, currentAccountFacility.positionLimitType) &&
        Objects.equals(this.positionLimitSettings, currentAccountFacility.positionLimitSettings) &&
        Objects.equals(this.positionLimitValue, currentAccountFacility.positionLimitValue) &&
        Objects.equals(this.dateType, currentAccountFacility.dateType) &&
        Objects.equals(this.date, currentAccountFacility.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference, currentAccountNumber, customerReference, bankBranchOrLocationReference, accountType, accountCurrency, taxReference, entitlementOptionDefinition, entitlementOptionSetting, restrictionOptionDefinition, restrictionOptionSetting, associations, associationType, associationObligationOrEntitlement, associationReference, linkedAccounts, linkType, accountDetails, positionLimits, positionLimitType, positionLimitSettings, positionLimitValue, dateType, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentAccountFacility {\n");
    
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    currentAccountNumber: ").append(toIndentedString(currentAccountNumber)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    bankBranchOrLocationReference: ").append(toIndentedString(bankBranchOrLocationReference)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountCurrency: ").append(toIndentedString(accountCurrency)).append("\n");
    sb.append("    taxReference: ").append(toIndentedString(taxReference)).append("\n");
    sb.append("    entitlementOptionDefinition: ").append(toIndentedString(entitlementOptionDefinition)).append("\n");
    sb.append("    entitlementOptionSetting: ").append(toIndentedString(entitlementOptionSetting)).append("\n");
    sb.append("    restrictionOptionDefinition: ").append(toIndentedString(restrictionOptionDefinition)).append("\n");
    sb.append("    restrictionOptionSetting: ").append(toIndentedString(restrictionOptionSetting)).append("\n");
    sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
    sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
    sb.append("    associationObligationOrEntitlement: ").append(toIndentedString(associationObligationOrEntitlement)).append("\n");
    sb.append("    associationReference: ").append(toIndentedString(associationReference)).append("\n");
    sb.append("    linkedAccounts: ").append(toIndentedString(linkedAccounts)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    accountDetails: ").append(toIndentedString(accountDetails)).append("\n");
    sb.append("    positionLimits: ").append(toIndentedString(positionLimits)).append("\n");
    sb.append("    positionLimitType: ").append(toIndentedString(positionLimitType)).append("\n");
    sb.append("    positionLimitSettings: ").append(toIndentedString(positionLimitSettings)).append("\n");
    sb.append("    positionLimitValue: ").append(toIndentedString(positionLimitValue)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
