/*
 * The Blockchain API
 * # About  Our vision is to make it super easy to interact with the decentralized web. We want you to be able to do this in any coding language and do it easily and quickly.   You're a key part of our vision. We love feature requests! <a href=\"#section/Feature-Requests\">Make one!</a>  # How to Use the API  To use the API, you simply need to create an API key pair.  Doing so takes less than a minute. Simply go to <a target=\"_blank\" href=\"https://dashboard.blockchainapi.com\">the dashboard</a>, create an account, and generate a key pair. You can now use this pair to make API requests. You must create your first pair via the dashboard.  # Feature Requests  Got a feature request? Submit it as an issue on <a target=\"_blank\" href=\"https://github.com/BL0CK-X/the-blockchain-api/issues/new/choose\">our GitHub repo</a> or [email us](mailto:info@blockchainapi.com).  # Contact  <figure>     <img          width=\"40px\"         height=\"40px\"          src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/phone.svg\"     />     <figcaption style=\"textAlign:center;\">Text / Call: +1 (415) 888 4745 </figcaption> </figure> <a href=\"mailto:info@blockchainapi.com\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/email.svg\"         />         <figcaption style=\"textAlign:center;\">Email us: info@blockchainapi.com</figcaption>     </figure> </a> <a href=\"https://discord.gg/d49yzrZRAF\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/discord.svg\"         />         <figcaption style=\"textAlign:center;\">Join our Discord</figcaption>     </figure> </a> <a href=\"https://twitter.com/_BlockX_\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/twitter.svg\"         />          <figcaption style=\"textAlign:center;\">Follow us on Twitter</figcaption>     </figure> </a> <a href=\"https://github.com/BL0CK-X/the-blockchain-api\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/github.svg\"         />         <figcaption style=\"textAlign:center;\">Star us on Github</figcaption>     </figure> </a>  # Security  Common dogma is to never give out your seed phrase. We agree. It's a matter of security, and anyone who has your seed phrase can irreversibly empty your wallet.   <b>When using an API endpoint that requires a seed phrase, we highly recommend that users use or create a wallet that they do not use as their primary wallet.</b>   How you make this work depends on what you're doing. If you're minting an NFT for example, we recommend creating a new wallet and then transferring just enough SOL to that wallet to mint the NFT. This is possible on Solana because such transactions cost less than a penny. We will have more tutorials in the future that make it easier for you to be secure when using our API.  We have easy-to-use endpoints for <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1secret_recovery_phrase/post\">creating a new seed phrase</a> and then <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1public_key/post\">deriving a public key</a> to enable you to transfer to that new wallet.  Let's have a constructive dialog about this. Feel free to <a href=\"#section/Contact\">contact us</a>. I made a video discussing this matter <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.  Note: We have had a couple of individuals harrass and threaten us. These individuals did <b>not</b> try our API or speak to anyone who has used it. They simply saw that we require a seed phrase for certain endpoints and figured that the proper response was to attack us. (I explain why we do <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.) Such harrassment and threats are not only harmful, but they are also illegal, and we will report offenders. Do not harrass us. Rather, feel free to discuss your concerns with us and we will be more than happy to work with you to come up with a solution.  # Pricing  <b>Each user receives 100 free credits. Each user can call endpoints that cost 0 credits up to 50 requests/min before being rate-limited.</b> Thereafter, they can upgrade to have a higher rate limit. The purpose of this is to act like a free trial -- not to function like a freemium model where one can stay on the free tier indefinitely.  You can learn more about our pricing <a href=\"https://dashboard.blockchainapi.com/billing\" target=\"_blank\">here</a>.   We frequently do custom plans. If our pricing doesn't work for you, <a href=\"#section/Contact\">contact us</a>.  If you have questions, concerns, feedback, or ideas, <a href=\"#section/Contact\">contact us</a>.  # SDKs / API Wrappers  We have examples using both our <a href=\"https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples\" target=\"_blank\">Python wrapper and our JavaScript wrapper here</a>.  We have built a custom <a href=\"https://github.com/BL0CK-X/the-blockchain-api-python-wrapper\" target=\"_blank\">Python wrapper</a>.  `pip install theblockchainapi`  We also have published a <a href=\"https://github.com/BL0CK-X/theblockchainapi-javascript-wrapper\" target=\"_blank\">JavaScript Wrapper</a>.  `npm install theblockchainapi`  We also have auto-generated wrappers for the following languages: - <a href=\"https://github.com/BL0CK-X/theblockchainapi-go-wrapper\" target = \"_blank\">Go</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-java-wrapper\" target = \"_blank\">Java</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-kotlin-wrapper\" target = \"_blank\">Kotlin</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-php-wrapper\" target = \"_blank\">PHP</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-swift-wrapper\" target = \"_blank\">Swift5</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-typescript-wrapper\" target = \"_blank\">TypeScript</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-csharp-wrapper\" target = \"_blank\">C#</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-dart-wrapper\" target = \"_blank\">Dart</a>  If you would like a different language as well, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.  If you run into any bugs with the wrappers, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.
 *
 * The version of the OpenAPI document: null
 * Contact: info@blockchainapi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Endpoint;
import org.openapitools.client.model.Group;

/**
 * Project
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-15T12:06:18.396945-07:00[America/Los_Angeles]")
public class Project {
  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_PROJECT_NAME = "project_name";
  @SerializedName(SERIALIZED_NAME_PROJECT_NAME)
  private String projectName;

  public static final String SERIALIZED_NAME_PROJECT_DESCRIPTION = "project_description";
  @SerializedName(SERIALIZED_NAME_PROJECT_DESCRIPTION)
  private String projectDescription;

  public static final String SERIALIZED_NAME_CONTACT_EMAIL = "contact_email";
  @SerializedName(SERIALIZED_NAME_CONTACT_EMAIL)
  private String contactEmail;

  public static final String SERIALIZED_NAME_CURRENT_DOCUMENTATION_VERSION = "current_documentation_version";
  @SerializedName(SERIALIZED_NAME_CURRENT_DOCUMENTATION_VERSION)
  private String currentDocumentationVersion;

  public static final String SERIALIZED_NAME_VERSIONS = "versions";
  @SerializedName(SERIALIZED_NAME_VERSIONS)
  private List<String> versions = null;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<Group> groups = null;

  public static final String SERIALIZED_NAME_ENDPOINTS = "endpoints";
  @SerializedName(SERIALIZED_NAME_ENDPOINTS)
  private List<Endpoint> endpoints = null;


  public Project projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of the project. This is auto-generated upon project creation and cannot currently be changed. 
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project. This is auto-generated upon project creation and cannot currently be changed. ")

  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public Project projectName(String projectName) {
    
    this.projectName = projectName;
    return this;
  }

   /**
   * The name of the mini-API. This will be shown at the top of the mini-API&#39;s documentation. 
   * @return projectName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the mini-API. This will be shown at the top of the mini-API's documentation. ")

  public String getProjectName() {
    return projectName;
  }


  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }


  public Project projectDescription(String projectDescription) {
    
    this.projectDescription = projectDescription;
    return this;
  }

   /**
   * The description of the mini-API. This will be shown at the top of the mini-API&#39;s documentation, below the title. 
   * @return projectDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the mini-API. This will be shown at the top of the mini-API's documentation, below the title. ")

  public String getProjectDescription() {
    return projectDescription;
  }


  public void setProjectDescription(String projectDescription) {
    this.projectDescription = projectDescription;
  }


  public Project contactEmail(String contactEmail) {
    
    this.contactEmail = contactEmail;
    return this;
  }

   /**
   * The email where users of your mini-API can contact you. This will be shown at the top of the mini-API&#39;s documentation. 
   * @return contactEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email where users of your mini-API can contact you. This will be shown at the top of the mini-API's documentation. ")

  public String getContactEmail() {
    return contactEmail;
  }


  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }


  public Project currentDocumentationVersion(String currentDocumentationVersion) {
    
    this.currentDocumentationVersion = currentDocumentationVersion;
    return this;
  }

   /**
   * The version of the API that the documentation is updated for. You can set the documentation version to any valid version. To see how to format the version string, see the description for &#x60;versions&#x60;. 
   * @return currentDocumentationVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of the API that the documentation is updated for. You can set the documentation version to any valid version. To see how to format the version string, see the description for `versions`. ")

  public String getCurrentDocumentationVersion() {
    return currentDocumentationVersion;
  }


  public void setCurrentDocumentationVersion(String currentDocumentationVersion) {
    this.currentDocumentationVersion = currentDocumentationVersion;
  }


  public Project versions(List<String> versions) {
    
    this.versions = versions;
    return this;
  }

  public Project addVersionsItem(String versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<String>();
    }
    this.versions.add(versionsItem);
    return this;
  }

   /**
   * The live versions of the project. An array of strings. We use Python&#39;s &#x60;version&#x60; package to see if it&#39;s a valid version and to compare versions (to see which is higher).  Read more about this Python package &lt;a href&#x3D;\&quot;https://packaging.pypa.io/en/latest/version.html#packaging.version.parse\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
   * @return versions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The live versions of the project. An array of strings. We use Python's `version` package to see if it's a valid version and to compare versions (to see which is higher).  Read more about this Python package <a href=\"https://packaging.pypa.io/en/latest/version.html#packaging.version.parse\" target=\"_blank\">here</a>.")

  public List<String> getVersions() {
    return versions;
  }


  public void setVersions(List<String> versions) {
    this.versions = versions;
  }


  public Project groups(List<Group> groups) {
    
    this.groups = groups;
    return this;
  }

  public Project addGroupsItem(Group groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<Group>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * A list of groups. A section contains groups, and groups contain API endpoints.  
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of groups. A section contains groups, and groups contain API endpoints.  ")

  public List<Group> getGroups() {
    return groups;
  }


  public void setGroups(List<Group> groups) {
    this.groups = groups;
  }


  public Project endpoints(List<Endpoint> endpoints) {
    
    this.endpoints = endpoints;
    return this;
  }

  public Project addEndpointsItem(Endpoint endpointsItem) {
    if (this.endpoints == null) {
      this.endpoints = new ArrayList<Endpoint>();
    }
    this.endpoints.add(endpointsItem);
    return this;
  }

   /**
   * A list of groups. A section contains groups, and groups contain API endpoints.  
   * @return endpoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of groups. A section contains groups, and groups contain API endpoints.  ")

  public List<Endpoint> getEndpoints() {
    return endpoints;
  }


  public void setEndpoints(List<Endpoint> endpoints) {
    this.endpoints = endpoints;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.projectId, project.projectId) &&
        Objects.equals(this.projectName, project.projectName) &&
        Objects.equals(this.projectDescription, project.projectDescription) &&
        Objects.equals(this.contactEmail, project.contactEmail) &&
        Objects.equals(this.currentDocumentationVersion, project.currentDocumentationVersion) &&
        Objects.equals(this.versions, project.versions) &&
        Objects.equals(this.groups, project.groups) &&
        Objects.equals(this.endpoints, project.endpoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, projectName, projectDescription, contactEmail, currentDocumentationVersion, versions, groups, endpoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    projectDescription: ").append(toIndentedString(projectDescription)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    currentDocumentationVersion: ").append(toIndentedString(currentDocumentationVersion)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

