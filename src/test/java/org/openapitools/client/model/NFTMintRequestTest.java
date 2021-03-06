/*
 * The Blockchain API
 * # About  Our vision is to make it super easy to interact with the decentralized web. We want you to be able to do this in any coding language and do it easily and quickly.   You're a key part of our vision. We love feature requests! <a href=\"#section/Feature-Requests\">Make one!</a>  # How to Use the API  To use the API, you simply need to create an API key pair.  Doing so takes less than a minute. Simply go to <a target=\"_blank\" href=\"https://dashboard.theblockchainapi.com\">the dashboard</a>, create an account, and generate a key pair. You can now use this pair to make API requests. You must create your first pair via the dashboard.  # Feature Requests  Got a feature request? Submit it as an issue on <a target=\"_blank\" href=\"https://github.com/BL0CK-X/the-blockchain-api/issues/new/choose\">our GitHub repo</a> or [email us](mailto:info@theblockchainapi.com).  # Contact  <figure>     <img          width=\"40px\"         height=\"40px\"          src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/phone.svg\"     />     <figcaption style=\"textAlign:center;\">Text / Call: +1 (415) 888 4745 </figcaption> </figure> <a href=\"mailto:info@theblockchainapi.com\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/email.svg\"         />         <figcaption style=\"textAlign:center;\">Email us: info@theblockchainapi.com</figcaption>     </figure> </a> <a href=\"https://discord.gg/d49yzrZRAF\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/discord.svg\"         />         <figcaption style=\"textAlign:center;\">Join our Discord</figcaption>     </figure> </a> <a href=\"https://twitter.com/_BlockX_\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/twitter.svg\"         />          <figcaption style=\"textAlign:center;\">Follow us on Twitter</figcaption>     </figure> </a> <a href=\"https://github.com/BL0CK-X/the-blockchain-api\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/github.svg\"         />         <figcaption style=\"textAlign:center;\">Star us on Github</figcaption>     </figure> </a>  # Security  Common dogma is to never give out your seed phrase. We agree. It's a matter of security, and anyone who has your seed phrase can irreversibly empty your wallet.   <b>When using an API endpoint that requires a seed phrase, we highly recommend that users use or create a wallet that they do not use as their primary wallet.</b>   How you make this work depends on what you're doing. If you're minting an NFT for example, we recommend creating a new wallet and then transferring just enough SOL to that wallet to mint the NFT. This is possible on Solana because such transactions cost less than a penny. We will have more tutorials in the future that make it easier for you to be secure when using our API.  We have easy-to-use endpoints for <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1secret_recovery_phrase/post\">creating a new seed phrase</a> and then <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1public_key/post\">deriving a public key</a> to enable you to transfer to that new wallet.  Let's have a constructive dialog about this. Feel free to <a href=\"#section/Contact\">contact us</a>. I made a video discussing this matter <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.  Note: We have had a couple of individuals harrass and threaten us. These individuals did <b>not</b> try our API or speak to anyone who has used it. They simply saw that we require a seed phrase for certain endpoints and figured that the proper response was to attack us. (I explain why we do <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.) Such harrassment and threats are not only harmful, but they are also illegal, and we will report offenders. Do not harrass us. Rather, feel free to discuss your concerns with us and we will be more than happy to work with you to come up with a solution.  # Pricing  You can learn more about our pricing <a href=\"https://dashboard.theblockchainapi.com/billing\" target=\"_blank\">here</a>. If you have questions, concerns, feedback, or ideas, <a href=\"#section/Contact\">contact us</a>.  We have a free tier where each user receives 500 free requests every month.  
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@theblockchainapi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for NFTMintRequest
 */
public class NFTMintRequestTest {
    private final NFTMintRequest model = new NFTMintRequest();

    /**
     * Model tests for NFTMintRequest
     */
    @Test
    public void testNFTMintRequest() {
        // TODO: test NFTMintRequest
    }

    /**
     * Test the property 'secretRecoveryPhrase'
     */
    @Test
    public void secretRecoveryPhraseTest() {
        // TODO: test secretRecoveryPhrase
    }

    /**
     * Test the property 'derivationPath'
     */
    @Test
    public void derivationPathTest() {
        // TODO: test derivationPath
    }

    /**
     * Test the property 'passphrase'
     */
    @Test
    public void passphraseTest() {
        // TODO: test passphrase
    }

    /**
     * Test the property 'nftName'
     */
    @Test
    public void nftNameTest() {
        // TODO: test nftName
    }

    /**
     * Test the property 'nftSymbol'
     */
    @Test
    public void nftSymbolTest() {
        // TODO: test nftSymbol
    }

    /**
     * Test the property 'nftDescription'
     */
    @Test
    public void nftDescriptionTest() {
        // TODO: test nftDescription
    }

    /**
     * Test the property 'nftUrl'
     */
    @Test
    public void nftUrlTest() {
        // TODO: test nftUrl
    }

    /**
     * Test the property 'nftMetadata'
     */
    @Test
    public void nftMetadataTest() {
        // TODO: test nftMetadata
    }

    /**
     * Test the property 'nftUploadMethod'
     */
    @Test
    public void nftUploadMethodTest() {
        // TODO: test nftUploadMethod
    }

    /**
     * Test the property 'isMutable'
     */
    @Test
    public void isMutableTest() {
        // TODO: test isMutable
    }

    /**
     * Test the property 'isMasterEdition'
     */
    @Test
    public void isMasterEditionTest() {
        // TODO: test isMasterEdition
    }

    /**
     * Test the property 'sellerFeeBasisPoints'
     */
    @Test
    public void sellerFeeBasisPointsTest() {
        // TODO: test sellerFeeBasisPoints
    }

    /**
     * Test the property 'creators'
     */
    @Test
    public void creatorsTest() {
        // TODO: test creators
    }

    /**
     * Test the property 'share'
     */
    @Test
    public void shareTest() {
        // TODO: test share
    }

    /**
     * Test the property 'network'
     */
    @Test
    public void networkTest() {
        // TODO: test network
    }

}
