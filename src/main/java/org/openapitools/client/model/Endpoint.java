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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ParameterSpecification;

/**
 * Endpoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-15T12:06:18.396945-07:00[America/Los_Angeles]")
public class Endpoint {
  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_OPERATION_ID = "operation_id";
  @SerializedName(SERIALIZED_NAME_OPERATION_ID)
  private String operationId;

  public static final String SERIALIZED_NAME_READABLE_NAME = "readable_name";
  @SerializedName(SERIALIZED_NAME_READABLE_NAME)
  private String readableName;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CREDITS = "credits";
  @SerializedName(SERIALIZED_NAME_CREDITS)
  private BigDecimal credits;

  public static final String SERIALIZED_NAME_GROUP_NAME = "group_name";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_INPUT_SPECIFICATION = "input_specification";
  @SerializedName(SERIALIZED_NAME_INPUT_SPECIFICATION)
  private List<ParameterSpecification> inputSpecification = new ArrayList<ParameterSpecification>();

  public static final String SERIALIZED_NAME_INPUT_EXAMPLES = "input_examples";
  @SerializedName(SERIALIZED_NAME_INPUT_EXAMPLES)
  private Object inputExamples;

  public static final String SERIALIZED_NAME_OUTPUT_SPECIFICATION = "output_specification";
  @SerializedName(SERIALIZED_NAME_OUTPUT_SPECIFICATION)
  private List<ParameterSpecification> outputSpecification = new ArrayList<ParameterSpecification>();

  public static final String SERIALIZED_NAME_OUTPUT_EXAMPLES = "output_examples";
  @SerializedName(SERIALIZED_NAME_OUTPUT_EXAMPLES)
  private Object outputExamples;


  public Endpoint projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of the project. This is auto-generated upon project creation and cannot currently be changed. 
   * @return projectId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the project. This is auto-generated upon project creation and cannot currently be changed. ")

  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public Endpoint version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The project version under which the endpoint exists 
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The project version under which the endpoint exists ")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public Endpoint path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * The path of the endpoint 
   * @return path
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The path of the endpoint ")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public Endpoint operationId(String operationId) {
    
    this.operationId = operationId;
    return this;
  }

   /**
   * The operation ID of the endpoint. 
   * @return operationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The operation ID of the endpoint. ")

  public String getOperationId() {
    return operationId;
  }


  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }


  public Endpoint readableName(String readableName) {
    
    this.readableName = readableName;
    return this;
  }

   /**
   * The name of the endpoint formatted in a readable way (e.g., Get Endpoint Metadata). 
   * @return readableName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the endpoint formatted in a readable way (e.g., Get Endpoint Metadata). ")

  public String getReadableName() {
    return readableName;
  }


  public void setReadableName(String readableName) {
    this.readableName = readableName;
  }


  public Endpoint summary(String summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * The summary of the endpoint to be displayed in the sidebar on the left of the mini-API&#39;s documentation 
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The summary of the endpoint to be displayed in the sidebar on the left of the mini-API's documentation ")

  public String getSummary() {
    return summary;
  }


  public void setSummary(String summary) {
    this.summary = summary;
  }


  public Endpoint description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of what the endpoint does. This will be shown in the mini-API documentation. 
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description of what the endpoint does. This will be shown in the mini-API documentation. ")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Endpoint credits(BigDecimal credits) {
    
    this.credits = credits;
    return this;
  }

   /**
   * The price of the endpoint. Valid values are integers from 1 to 100. 
   * @return credits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The price of the endpoint. Valid values are integers from 1 to 100. ")

  public BigDecimal getCredits() {
    return credits;
  }


  public void setCredits(BigDecimal credits) {
    this.credits = credits;
  }


  public Endpoint groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * The name of the group of endpoints that the endpoint comes from 
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the group of endpoints that the endpoint comes from ")

  public String getGroupName() {
    return groupName;
  }


  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public Endpoint inputSpecification(List<ParameterSpecification> inputSpecification) {
    
    this.inputSpecification = inputSpecification;
    return this;
  }

  public Endpoint addInputSpecificationItem(ParameterSpecification inputSpecificationItem) {
    this.inputSpecification.add(inputSpecificationItem);
    return this;
  }

   /**
   * A list of dictionaries. Each dictionary describes one parameter for the input, including the name, type, required boolean, and description values of that parameter.
   * @return inputSpecification
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of dictionaries. Each dictionary describes one parameter for the input, including the name, type, required boolean, and description values of that parameter.")

  public List<ParameterSpecification> getInputSpecification() {
    return inputSpecification;
  }


  public void setInputSpecification(List<ParameterSpecification> inputSpecification) {
    this.inputSpecification = inputSpecification;
  }


  public Endpoint inputExamples(Object inputExamples) {
    
    this.inputExamples = inputExamples;
    return this;
  }

   /**
   * An example of the JSON input that a user might send. Limited to one example currently. 
   * @return inputExamples
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An example of the JSON input that a user might send. Limited to one example currently. ")

  public Object getInputExamples() {
    return inputExamples;
  }


  public void setInputExamples(Object inputExamples) {
    this.inputExamples = inputExamples;
  }


  public Endpoint outputSpecification(List<ParameterSpecification> outputSpecification) {
    
    this.outputSpecification = outputSpecification;
    return this;
  }

  public Endpoint addOutputSpecificationItem(ParameterSpecification outputSpecificationItem) {
    this.outputSpecification.add(outputSpecificationItem);
    return this;
  }

   /**
   * A list of dictionaries. Each dictionary describes one parameter for the input, including the name, type, required boolean, and description values of that parameter.
   * @return outputSpecification
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of dictionaries. Each dictionary describes one parameter for the input, including the name, type, required boolean, and description values of that parameter.")

  public List<ParameterSpecification> getOutputSpecification() {
    return outputSpecification;
  }


  public void setOutputSpecification(List<ParameterSpecification> outputSpecification) {
    this.outputSpecification = outputSpecification;
  }


  public Endpoint outputExamples(Object outputExamples) {
    
    this.outputExamples = outputExamples;
    return this;
  }

   /**
   * An example of the JSON output that a user might send. Limited to one example currently. 
   * @return outputExamples
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An example of the JSON output that a user might send. Limited to one example currently. ")

  public Object getOutputExamples() {
    return outputExamples;
  }


  public void setOutputExamples(Object outputExamples) {
    this.outputExamples = outputExamples;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Endpoint endpoint = (Endpoint) o;
    return Objects.equals(this.projectId, endpoint.projectId) &&
        Objects.equals(this.version, endpoint.version) &&
        Objects.equals(this.path, endpoint.path) &&
        Objects.equals(this.operationId, endpoint.operationId) &&
        Objects.equals(this.readableName, endpoint.readableName) &&
        Objects.equals(this.summary, endpoint.summary) &&
        Objects.equals(this.description, endpoint.description) &&
        Objects.equals(this.credits, endpoint.credits) &&
        Objects.equals(this.groupName, endpoint.groupName) &&
        Objects.equals(this.inputSpecification, endpoint.inputSpecification) &&
        Objects.equals(this.inputExamples, endpoint.inputExamples) &&
        Objects.equals(this.outputSpecification, endpoint.outputSpecification) &&
        Objects.equals(this.outputExamples, endpoint.outputExamples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, version, path, operationId, readableName, summary, description, credits, groupName, inputSpecification, inputExamples, outputSpecification, outputExamples);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Endpoint {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    readableName: ").append(toIndentedString(readableName)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    inputSpecification: ").append(toIndentedString(inputSpecification)).append("\n");
    sb.append("    inputExamples: ").append(toIndentedString(inputExamples)).append("\n");
    sb.append("    outputSpecification: ").append(toIndentedString(outputSpecification)).append("\n");
    sb.append("    outputExamples: ").append(toIndentedString(outputExamples)).append("\n");
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

