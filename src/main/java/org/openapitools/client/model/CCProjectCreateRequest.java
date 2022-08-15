/*
 * The Blockchain API
 * # About  Our vision is to make it super easy to interact with the decentralized web. We want you to be able to do this in any coding language and do it easily and quickly.   You're a key part of our vision. We love feature requests! <a href=\"#section/Feature-Requests\">Make one!</a>  # How to Use the API  To use the API, you simply need to create an API key pair.  Doing so takes less than a minute. Simply go to <a target=\"_blank\" href=\"https://dashboard.blockchainapi.com\">the dashboard</a>, create an account, and generate a key pair. You can now use this pair to make API requests. You must create your first pair via the dashboard.  # Feature Requests  Got a feature request? Submit it as an issue on <a target=\"_blank\" href=\"https://github.com/BL0CK-X/the-blockchain-api/issues/new/choose\">our GitHub repo</a> or [email us](mailto:info@blockchainapi.com).  # Contact  <figure>     <img          width=\"40px\"         height=\"40px\"          src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/phone.svg\"     />     <figcaption style=\"textAlign:center;\">Text / Call: +1 (415) 888 4745 </figcaption> </figure> <a href=\"mailto:info@blockchainapi.com\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/email.svg\"         />         <figcaption style=\"textAlign:center;\">Email us: info@blockchainapi.com</figcaption>     </figure> </a> <a href=\"https://discord.gg/d49yzrZRAF\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/discord.svg\"         />         <figcaption style=\"textAlign:center;\">Join our Discord</figcaption>     </figure> </a> <a href=\"https://twitter.com/BlockchainAP1\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/twitter.svg\"         />          <figcaption style=\"textAlign:center;\">Follow us on Twitter</figcaption>     </figure> </a> <a href=\"https://github.com/BL0CK-X/the-blockchain-api\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/github.svg\"         />         <figcaption style=\"textAlign:center;\">Star us on Github</figcaption>     </figure> </a>  # Security  Common dogma is to never give out your seed phrase. We agree. It's a matter of security, and anyone who has your seed phrase can irreversibly empty your wallet.   <b>When using an API endpoint that requires a seed phrase, we highly recommend that users use or create a wallet that they do not use as their primary wallet.</b>   How you make this work depends on what you're doing. If you're minting an NFT for example, we recommend creating a new wallet and then transferring just enough SOL to that wallet to mint the NFT. This is possible on Solana because such transactions cost less than a penny. We will have more tutorials in the future that make it easier for you to be secure when using our API.  We have easy-to-use endpoints for <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1secret_recovery_phrase/post\">creating a new seed phrase</a> and then <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1public_key/post\">deriving a public key</a> to enable you to transfer to that new wallet.  Let's have a constructive dialog about this. Feel free to <a href=\"#section/Contact\">contact us</a>. I made a video discussing this matter <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.  Note: We have had a couple of individuals harrass and threaten us. These individuals did <b>not</b> try our API or speak to anyone who has used it. They simply saw that we require a seed phrase for certain endpoints and figured that the proper response was to attack us. (I explain why we do <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.) Such harrassment and threats are not only harmful, but they are also illegal, and we will report offenders. Do not harrass us. Rather, feel free to discuss your concerns with us and we will be more than happy to work with you to come up with a solution.  # Pricing  <b>Each user receives 50,000 free credits each month.</b> Each endpoint costs a certain amount credits. Scroll below to any endpoint (i.e., function) to see how much each endpoint costs. (Or CMD+F `Cost: 0 Credit`, for example)  You can learn more about our pricing <a href=\"https://dashboard.blockchainapi.com/billing\" target=\"_blank\">here</a>.   We frequently do custom plans. If our pricing doesn't work for you, <a href=\"#section/Contact\">contact us</a>.  If you have questions, concerns, feedback, or ideas, <a href=\"#section/Contact\">contact us</a>.  # SDKs / API Wrappers  We have examples using both our <a href=\"https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples\" target=\"_blank\">Python wrapper and our JavaScript wrapper here</a>.  We have built a custom <a href=\"https://github.com/BL0CK-X/the-blockchain-api-python-wrapper\" target=\"_blank\">Python wrapper</a>.  `pip install theblockchainapi`  We also have published a <a href=\"https://github.com/BL0CK-X/theblockchainapi-javascript-wrapper\" target=\"_blank\">JavaScript Wrapper</a>.  `npm install theblockchainapi`  We also have auto-generated wrappers for the following languages: - <a href=\"https://github.com/BL0CK-X/theblockchainapi-go-wrapper\" target = \"_blank\">Go</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-java-wrapper\" target = \"_blank\">Java</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-kotlin-wrapper\" target = \"_blank\">Kotlin</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-php-wrapper\" target = \"_blank\">PHP</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-swift-wrapper\" target = \"_blank\">Swift5</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-typescript-wrapper\" target = \"_blank\">TypeScript</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-csharp-wrapper\" target = \"_blank\">C#</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-dart-wrapper\" target = \"_blank\">Dart</a>  If you would like a different language as well, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.  If you run into any bugs with the wrappers, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.
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
import org.openapitools.client.model.CCProjectCreateRequestCustomerIdToCollect;
import org.openapitools.client.model.CCProjectCreateRequestPayoutMethod;

/**
 * You can change any of these parameters after creating the project. None of these parameters are required. 
 */
@ApiModel(description = "You can change any of these parameters after creating the project. None of these parameters are required. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-15T09:33:08.779026-07:00[America/Los_Angeles]")
public class CCProjectCreateRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private String webhook;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public static final String SERIALIZED_NAME_DISCORD_WEBHOOK = "discord_webhook";
  @SerializedName(SERIALIZED_NAME_DISCORD_WEBHOOK)
  private String discordWebhook;

  public static final String SERIALIZED_NAME_LOGO_URL = "logo_url";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_CUSTOMER_ID_TO_COLLECT = "customer_id_to_collect";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID_TO_COLLECT)
  private CCProjectCreateRequestCustomerIdToCollect customerIdToCollect;

  public static final String SERIALIZED_NAME_SUCCESS_URL = "success_url";
  @SerializedName(SERIALIZED_NAME_SUCCESS_URL)
  private String successUrl;

  public static final String SERIALIZED_NAME_PAYOUT_METHOD = "payout_method";
  @SerializedName(SERIALIZED_NAME_PAYOUT_METHOD)
  private CCProjectCreateRequestPayoutMethod payoutMethod;

  public CCProjectCreateRequest() { 
  }

  public CCProjectCreateRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the project. This is shown to your users and should identify your company or organization. 
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the project. This is shown to your users and should identify your company or organization. ")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CCProjectCreateRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of your project / company. 
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of your project / company. ")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CCProjectCreateRequest webhook(String webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * A URL that identifies where we should make an API request to notify you of a new payment (e.g., api.myproject.com/crypto_payments/webhook). Learn more [here](#tag/CC-Webhook/operation/getCCWebhook). 
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A URL that identifies where we should make an API request to notify you of a new payment (e.g., api.myproject.com/crypto_payments/webhook). Learn more [here](#tag/CC-Webhook/operation/getCCWebhook). ")

  public String getWebhook() {
    return webhook;
  }


  public void setWebhook(String webhook) {
    this.webhook = webhook;
  }


  public CCProjectCreateRequest website(String website) {
    
    this.website = website;
    return this;
  }

   /**
   * The website of your project / company. 
   * @return website
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The website of your project / company. ")

  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {
    this.website = website;
  }


  public CCProjectCreateRequest discordWebhook(String discordWebhook) {
    
    this.discordWebhook = discordWebhook;
    return this;
  }

   /**
   * A Discord webhook. We will send a message to this channel to notify of payment. Learn more [here](). 
   * @return discordWebhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A Discord webhook. We will send a message to this channel to notify of payment. Learn more [here](). ")

  public String getDiscordWebhook() {
    return discordWebhook;
  }


  public void setDiscordWebhook(String discordWebhook) {
    this.discordWebhook = discordWebhook;
  }


  public CCProjectCreateRequest logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * A URL of your logo. 
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A URL of your logo. ")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public CCProjectCreateRequest customerIdToCollect(CCProjectCreateRequestCustomerIdToCollect customerIdToCollect) {
    
    this.customerIdToCollect = customerIdToCollect;
    return this;
  }

   /**
   * Get customerIdToCollect
   * @return customerIdToCollect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CCProjectCreateRequestCustomerIdToCollect getCustomerIdToCollect() {
    return customerIdToCollect;
  }


  public void setCustomerIdToCollect(CCProjectCreateRequestCustomerIdToCollect customerIdToCollect) {
    this.customerIdToCollect = customerIdToCollect;
  }


  public CCProjectCreateRequest successUrl(String successUrl) {
    
    this.successUrl = successUrl;
    return this;
  }

   /**
   * Where to redirect customers after payment. If not supplied, customers will be redirected to checkout.blockchainapi.com/me to view their subscriptions. 
   * @return successUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Where to redirect customers after payment. If not supplied, customers will be redirected to checkout.blockchainapi.com/me to view their subscriptions. ")

  public String getSuccessUrl() {
    return successUrl;
  }


  public void setSuccessUrl(String successUrl) {
    this.successUrl = successUrl;
  }


  public CCProjectCreateRequest payoutMethod(CCProjectCreateRequestPayoutMethod payoutMethod) {
    
    this.payoutMethod = payoutMethod;
    return this;
  }

   /**
   * Get payoutMethod
   * @return payoutMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CCProjectCreateRequestPayoutMethod getPayoutMethod() {
    return payoutMethod;
  }


  public void setPayoutMethod(CCProjectCreateRequestPayoutMethod payoutMethod) {
    this.payoutMethod = payoutMethod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CCProjectCreateRequest ccProjectCreateRequest = (CCProjectCreateRequest) o;
    return Objects.equals(this.name, ccProjectCreateRequest.name) &&
        Objects.equals(this.description, ccProjectCreateRequest.description) &&
        Objects.equals(this.webhook, ccProjectCreateRequest.webhook) &&
        Objects.equals(this.website, ccProjectCreateRequest.website) &&
        Objects.equals(this.discordWebhook, ccProjectCreateRequest.discordWebhook) &&
        Objects.equals(this.logoUrl, ccProjectCreateRequest.logoUrl) &&
        Objects.equals(this.customerIdToCollect, ccProjectCreateRequest.customerIdToCollect) &&
        Objects.equals(this.successUrl, ccProjectCreateRequest.successUrl) &&
        Objects.equals(this.payoutMethod, ccProjectCreateRequest.payoutMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, webhook, website, discordWebhook, logoUrl, customerIdToCollect, successUrl, payoutMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CCProjectCreateRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    discordWebhook: ").append(toIndentedString(discordWebhook)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    customerIdToCollect: ").append(toIndentedString(customerIdToCollect)).append("\n");
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
    sb.append("    payoutMethod: ").append(toIndentedString(payoutMethod)).append("\n");
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
