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
import org.openapitools.client.model.GeneralB58PrivateKey;
import org.openapitools.client.model.GeneralPrivateKey;
import org.openapitools.client.model.HexPrivateKey;

/**
 * GeneralGeneratePrivateKeyResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-30T11:04:39.768692-07:00[America/Los_Angeles]")
public class GeneralGeneratePrivateKeyResponse {
  public static final String SERIALIZED_NAME_HEX_PRIVATE_KEY = "hex_private_key";
  @SerializedName(SERIALIZED_NAME_HEX_PRIVATE_KEY)
  private String hexPrivateKey;

  public static final String SERIALIZED_NAME_PRIVATE_KEY = "private_key";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY)
  private Object privateKey;

  public static final String SERIALIZED_NAME_B58_PRIVATE_KEY = "b58_private_key";
  @SerializedName(SERIALIZED_NAME_B58_PRIVATE_KEY)
  private String b58PrivateKey;

  public GeneralGeneratePrivateKeyResponse() { 
  }

  public GeneralGeneratePrivateKeyResponse hexPrivateKey(String hexPrivateKey) {
    
    this.hexPrivateKey = hexPrivateKey;
    return this;
  }

   /**
   * A hex private key is the typical private key used on Ethereum, for example. It looks like this: &#x60;0x200b9e5baa38b0dc7551645be11b394e9bf2b04532e4af8824bed2b3de2e0dc0&#x60;.  You can use &#x60;hex_private_key&#x60; for chains: &#x60;avalanche&#x60;, &#x60;binance_smart_chain&#x60;, &#x60;ethereum&#x60;.
   * @return hexPrivateKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A hex private key is the typical private key used on Ethereum, for example. It looks like this: `0x200b9e5baa38b0dc7551645be11b394e9bf2b04532e4af8824bed2b3de2e0dc0`.  You can use `hex_private_key` for chains: `avalanche`, `binance_smart_chain`, `ethereum`.")

  public String getHexPrivateKey() {
    return hexPrivateKey;
  }


  public void setHexPrivateKey(String hexPrivateKey) {
    this.hexPrivateKey = hexPrivateKey;
  }


  public GeneralGeneratePrivateKeyResponse privateKey(Object privateKey) {
    
    this.privateKey = privateKey;
    return this;
  }

   /**
   * A private key corresponds to exactly one public key address. A private key can be used to move assets out of the wallet and sign transaction with the corresponding public key.  A private key is an array of integers (e.g.,   &#x60;[185,108,153,165,57,193,166,167,58,148,133,121,92,252,242,13,233,246,35,103,185,20,27,56,111,169,12,50,50,36,83,156,173,195,143,75,135,78,204,129,217,231,58,129,69,180,185,86,119,43,200,193,94,112,31,135,68,128,207,26,85,150,68,181]&#x60;).  &lt;a href&#x3D;\&quot;https://solflare.com\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Solflare&lt;/a&gt; is a popular wallet interface on Solana that allows you to export your private key in this format.  You can use &#x60;private_key&#x60; for Chains: &#x60;avalanche&#x60;, &#x60;binance_smart_chain&#x60;, &#x60;ethereum&#x60;, &#x60;solana&#x60;, &#x60;near&#x60;.
   * @return privateKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A private key corresponds to exactly one public key address. A private key can be used to move assets out of the wallet and sign transaction with the corresponding public key.  A private key is an array of integers (e.g.,   `[185,108,153,165,57,193,166,167,58,148,133,121,92,252,242,13,233,246,35,103,185,20,27,56,111,169,12,50,50,36,83,156,173,195,143,75,135,78,204,129,217,231,58,129,69,180,185,86,119,43,200,193,94,112,31,135,68,128,207,26,85,150,68,181]`).  <a href=\"https://solflare.com\" target=\"_blank\">Solflare</a> is a popular wallet interface on Solana that allows you to export your private key in this format.  You can use `private_key` for Chains: `avalanche`, `binance_smart_chain`, `ethereum`, `solana`, `near`.")

  public Object getPrivateKey() {
    return privateKey;
  }


  public void setPrivateKey(Object privateKey) {
    this.privateKey = privateKey;
  }


  public GeneralGeneratePrivateKeyResponse b58PrivateKey(String b58PrivateKey) {
    
    this.b58PrivateKey = b58PrivateKey;
    return this;
  }

   /**
   * A private key corresponds to exactly one public key address. A private key can be used to move assets out of the wallet and sign transaction with the corresponding public key.  A base58-encoded private key is a base58-encoded version of the typical private key. It is represented as a string (e.g., &#x60;4waBTVeAVWEAczSdx36uMrR19668ACgQDs7r386vrUes3UCzvXCQ2FPSCVGb1zJrwcULgpNzgABreyQaWSpGBwfx&#x60;).  &lt;a href&#x3D;\&quot;https://phantom.app\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Phantom&lt;/a&gt; is a popular wallet interface on Solana that allows you to export your private key in this format.  You can use &#x60;b58_private_key&#x60; for Chains: &#x60;solana&#x60;, &#x60;near&#x60;
   * @return b58PrivateKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A private key corresponds to exactly one public key address. A private key can be used to move assets out of the wallet and sign transaction with the corresponding public key.  A base58-encoded private key is a base58-encoded version of the typical private key. It is represented as a string (e.g., `4waBTVeAVWEAczSdx36uMrR19668ACgQDs7r386vrUes3UCzvXCQ2FPSCVGb1zJrwcULgpNzgABreyQaWSpGBwfx`).  <a href=\"https://phantom.app\" target=\"_blank\">Phantom</a> is a popular wallet interface on Solana that allows you to export your private key in this format.  You can use `b58_private_key` for Chains: `solana`, `near`")

  public String getB58PrivateKey() {
    return b58PrivateKey;
  }


  public void setB58PrivateKey(String b58PrivateKey) {
    this.b58PrivateKey = b58PrivateKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralGeneratePrivateKeyResponse generalGeneratePrivateKeyResponse = (GeneralGeneratePrivateKeyResponse) o;
    return Objects.equals(this.hexPrivateKey, generalGeneratePrivateKeyResponse.hexPrivateKey) &&
        Objects.equals(this.privateKey, generalGeneratePrivateKeyResponse.privateKey) &&
        Objects.equals(this.b58PrivateKey, generalGeneratePrivateKeyResponse.b58PrivateKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hexPrivateKey, privateKey, b58PrivateKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralGeneratePrivateKeyResponse {\n");
    sb.append("    hexPrivateKey: ").append(toIndentedString(hexPrivateKey)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    b58PrivateKey: ").append(toIndentedString(b58PrivateKey)).append("\n");
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

