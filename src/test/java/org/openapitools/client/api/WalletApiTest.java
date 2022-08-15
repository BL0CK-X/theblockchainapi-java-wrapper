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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.GeneralAirdropRequest;
import org.openapitools.client.model.GeneralBalanceRequest;
import org.openapitools.client.model.GeneralBalanceResponse;
import org.openapitools.client.model.GeneralGeneratePrivateKeyResponse;
import org.openapitools.client.model.GeneralSecretPhrase;
import org.openapitools.client.model.GeneralTransactionMadeResponse;
import org.openapitools.client.model.GeneralTransactionResponse;
import org.openapitools.client.model.GeneralTransferRequest;
import org.openapitools.client.model.GenerateSeedPhraseRequest;
import org.openapitools.client.model.SupplyWalletRequest;
import org.openapitools.client.model.WalletIdentifiers;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WalletApi
 */
@Ignore
public class WalletApiTest {

    private final WalletApi api = new WalletApi();

    
    /**
     * Derive private key
     *
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/wallet/derive-private-key\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Use this endpoint to securely derive a private key for a wallet.   For example, if you have a seed phrase and want to derive the corresponding private key, use this endpoint.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void derivePrivateKeyTest() throws ApiException {
        String blockchain = null;
        SupplyWalletRequest supplyWalletRequest = null;
                GeneralGeneratePrivateKeyResponse response = api.derivePrivateKey(blockchain, supplyWalletRequest);
        // TODO: test validations
    }
    
    /**
     * Derive wallet identifier
     *
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/wallet/derive-wallet-identifier\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Derive the identifier for a wallet.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deriveWalletIdentifierTest() throws ApiException {
        String blockchain = null;
        SupplyWalletRequest supplyWalletRequest = null;
                WalletIdentifiers response = api.deriveWalletIdentifier(blockchain, supplyWalletRequest);
        // TODO: test validations
    }
    
    /**
     * Generate private key
     *
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/wallet/generate-private-key\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Use this endpoint to securely and randomly generate a private key for a wallet.   &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generatePrivateKeyTest() throws ApiException {
        String blockchain = null;
                GeneralGeneratePrivateKeyResponse response = api.generatePrivateKey(blockchain);
        // TODO: test validations
    }
    
    /**
     * Generate seed phrase
     *
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/wallet/generate-secret-phrase\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Use this endpoint to securely and randomly generate a seed phrase for a wallet.   &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateSeedPhraseTest() throws ApiException {
        String blockchain = null;
        GenerateSeedPhraseRequest generateSeedPhraseRequest = null;
                GeneralSecretPhrase response = api.generateSeedPhrase(blockchain, generateSeedPhraseRequest);
        // TODO: test validations
    }
    
    /**
     * Get an airdrop
     *
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/wallet/get-airdrop\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      - Ethereum: Receive an airdrop of 0.001 ETH on Ropsten (not real ETH).  - Solana: Use this endpoint to get an airdrop of SOL on the devnet (not real SOL). Amount of 0.015, which is the minimum amount of SOL you need to mint an NFT and then transfer it to another wallet.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAirdropTest() throws ApiException {
        String blockchain = null;
        GeneralAirdropRequest generalAirdropRequest = null;
                GeneralTransactionMadeResponse response = api.getAirdrop(blockchain, generalAirdropRequest);
        // TODO: test validations
    }
    
    /**
     * Get wallet&#39;s balance of X
     *
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/wallet/get-wallet-balance\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      See the balance of a wallet in the native blockchain currency (e.g., ETH, SOL) or any token (e.g., ERC-20, NFTs, SPL, etc.).  To get the balance of a specific token, supply the &#x60;token_blockchain_identifier&#x60; of the token.   You can also use this endpoint to see whether or not a person owns an NFT. Just supply the &#x60;token_blockchain_identifier&#x60; of the NFT. A balance of \&quot;1\&quot; means the person owns the NFT, and a balance of \&quot;0\&quot; means the person does not own the NFT.  &#x60;Cost: 0.25 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBalanceTest() throws ApiException {
        String blockchain = null;
        GeneralBalanceRequest generalBalanceRequest = null;
                GeneralBalanceResponse response = api.getBalance(blockchain, generalBalanceRequest);
        // TODO: test validations
    }
    
    /**
     * Transfer crypto, a token, or an NFT to another wallet
     *
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/wallet/transfer-crypto-token-or-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See transfer ETH/SOL/crypto example (Python, JavaScript)&lt;/a&gt;.  &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/wallet/transfer-crypto-token-or-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See transfer NFT/token example (Python, JavaScript)&lt;/a&gt;.  This is a powerful function. It might be slightly confusing because there are several optional parameters, so take some time to review it.   This function can send - The native currency of the selected blockchain (e.g., SOL, ETH, BNB, etc.) - A token (e.g., an SPL token, ERC-20 token, etc.) - An NFT  You can sign and submit the transaction for confirmation; and you can select to simply return the compiled transaction so that you can submit it to the user for signing (e.g., via Phantom or Metamask; no private keys required in this case).  If you&#39;re transferring an NFT or a token, supply its respective &#x60;token_blockchain_identifier&#x60;.  SENDER: Note that the wallet information is used to authorize the sending of the tokens and identifies the source of the tokens. If &#x60;return_compiled_transaction &#x3D; false&#x60;, we sign and submit the transaction (&#x60;wallet&#x60; is required in this case; do not provide a value for &#x60;sender_blockchain_identifier&#x60;). If &#x60;return_compiled_transaction &#x3D; true&#x60;, we compile the transaction (&#x60;sender_blockchain_identifier&#x60; is required in this case; do not provide &#x60;wallet&#x60;).  RECIPIENT: &#x60;recipient_blockchain_identifier&#x60; identifies the receiver. This is entirely separate from the information used for the SENDER above. So, in this API call, there are two wallets involved, but only one (namely, the SENDER) is needed to authorize the transaction (if you want us to sign and submitting it).  FEE_PAYER (Solana only): The fee payer of the transaction defaults to &#x60;wallet&#x60; (or &#x60;sender_blockchain_identifier&#x60;). To set a different fee payer, provide a value for &#x60;fee_payer_wallet&#x60;.  &#x60;Cost: 2 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transferTest() throws ApiException {
        String blockchain = null;
        GeneralTransferRequest generalTransferRequest = null;
                GeneralTransactionResponse response = api.transfer(blockchain, generalTransferRequest);
        // TODO: test validations
    }
    
}
