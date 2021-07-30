package EmployeeGetList;

import java.util.List;

public class Employee {
  private Integer modificationStatus;
  private Integer token;
  private String name;
  private List<AdditionalField> additionalFields;
  private Integer fieldGroupToken;
  private Boolean accessGroupInherited;
  private Integer accessGroupToken;
  private Integer cardCount;
  private String departmentName;
  private Integer departmentToken;
  private String email;
  private String employeeNumber;
  private Integer iconToken;
  private Integer iconVersion;
  private String lastModified;
  private Boolean ownAccessRulesAssigned;
  private Integer photoToken;
  private Integer photoVersion;
  private String post;

  public Integer getModificationStatus() {
    return modificationStatus;
  }
  public void setModificationStatus(Integer modificationStatus) {
    this.modificationStatus = modificationStatus;
  }
  public Integer getToken() {
    return token;
  }
  public void setToken(Integer token) {
    this.token = token;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public List<AdditionalField> getAdditionalFields() {
    return additionalFields;
  }
  public void setAdditionalFields(List<AdditionalField> additionalFields) {
    this.additionalFields = additionalFields;
  }
  public Integer getFieldGroupToken() {
    return fieldGroupToken;
  }
  public void setFieldGroupToken(Integer fieldGroupToken) {
    this.fieldGroupToken = fieldGroupToken;
  }
  public Boolean getAccessGroupInherited() {
    return accessGroupInherited;
  }
  public void setAccessGroupInherited(Boolean accessGroupInherited) {
    this.accessGroupInherited = accessGroupInherited;
  }
  public Integer getAccessGroupToken() {
    return accessGroupToken;
  }
  public void setAccessGroupToken(Integer accessGroupToken) {
    this.accessGroupToken = accessGroupToken;
  }
  public Integer getCardCount() {
    return cardCount;
  }
  public void setCardCount(Integer cardCount) {
    this.cardCount = cardCount;
  }
  public String getDepartmentName() {
    return departmentName;
  }
  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }
  public Integer getDepartmentToken() {
    return departmentToken;
  }
  public void setDepartmentToken(Integer departmentToken) {
    this.departmentToken = departmentToken;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getEmployeeNumber() {
    return employeeNumber;
  }
  public void setEmployeeNumber(String employeeNumber) {
    this.employeeNumber = employeeNumber;
  }
  public Integer getIconToken() {
    return iconToken;
  }
  public void setIconToken(Integer iconToken) {
    this.iconToken = iconToken;
  }
  public Integer getIconVersion() {
    return iconVersion;
  }
  public void setIconVersion(Integer iconVersion) {
    this.iconVersion = iconVersion;
  }
  public String getLastModified() {
    return lastModified;
  }
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }
  public Boolean getOwnAccessRulesAssigned() {
    return ownAccessRulesAssigned;
  }
  public void setOwnAccessRulesAssigned(Boolean ownAccessRulesAssigned) {
    this.ownAccessRulesAssigned = ownAccessRulesAssigned;
  }
  public Integer getPhotoToken() {
    return photoToken;
  }
  public void setPhotoToken(Integer photoToken) {
    this.photoToken = photoToken;
  }
  public Integer getPhotoVersion() {
    return photoVersion;
  }
  public void setPhotoVersion(Integer photoVersion) {
    this.photoVersion = photoVersion;
  }
  public String getPost() {
    return post;
  }
  public void setPost(String post) {
    this.post = post;
  }

  @Override
  public String toString() {
    return "Employee {" +
        "modificationStatus=" + modificationStatus +
        ", token=" + token +
        ", name='" + name + '\'' +
        ", additionalFields=" + additionalFields +
        ", fieldGroupToken=" + fieldGroupToken +
        ", accessGroupInherited=" + accessGroupInherited +
        ", accessGroupToken=" + accessGroupToken +
        ", cardCount=" + cardCount +
        ", departmentName='" + departmentName + '\'' +
        ", departmentToken=" + departmentToken +
        ", email='" + email + '\'' +
        ", employeeNumber='" + employeeNumber + '\'' +
        ", iconToken=" + iconToken +
        ", iconVersion=" + iconVersion +
        ", lastModified='" + lastModified + '\'' +
        ", ownAccessRulesAssigned=" + ownAccessRulesAssigned +
        ", photoToken=" + photoToken +
        ", photoVersion=" + photoVersion +
        ", post='" + post + '\'' +
        '}';
  }
}