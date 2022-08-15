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
import org.openapitools.client.model.ATAResponse;
import org.openapitools.client.model.AirdropRequest;
import org.openapitools.client.model.BalanceRequest;
import org.openapitools.client.model.BalanceResponse;
import java.math.BigDecimal;
import org.openapitools.client.model.DoubleTransferResponse;
import org.openapitools.client.model.GeneratePrivateKey;
import org.openapitools.client.model.GetPublicKeyRequest;
import org.openapitools.client.model.ListNFTsResponse;
import org.openapitools.client.model.PublicKey;
import org.openapitools.client.model.SecretPhrase;
import org.openapitools.client.model.TransferRequest;
import org.openapitools.client.model.TransferResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SolanaWalletApi
 */
@Ignore
public class SolanaWalletApiTest {

    private final SolanaWalletApi api = new SolanaWalletApi();

    
    /**
     * Derive an associated token account address
     *
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-wallet/derive-associated-token-account-address\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See example (Python, JavaScript)&lt;/a&gt;.      *Each wallet can own tokens, but in Solana, each token is actually held by an &lt;a href&#x3D;\&quot;https://spl.solana.com/associated-token-account\&quot; target&#x3D;\&quot;_blank\&quot;&gt;associated token account&lt;/a&gt; (ATA), which is an account specific for a token owned by the wallet. When you transfer an SPL token, such as Serum, or transfer an NFT, you&#39;re transfering from an ATA you own to another person&#39;s ATA for that specific token. With this endpoint, you can derive an associated token address given a wallet and a token address.*  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void solanaDeriveAssociatedTokenAccountAddressTest() throws ApiException {
        String publicKey = null;
        String mintAddress = null;
                ATAResponse response = api.solanaDeriveAssociatedTokenAccountAddress(publicKey, mintAddress);
        // TODO: test validations
    }
    
    /**
     * Derive private key
     *
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-wallet/derive-private-key\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Returns a private key array and a base58-encoded private key given wallet authentication.  A wallet is defined by a public key. A public key is derived from a combination of seed phrase, derivation path, and passphrase. Changing any *one* of these three will change the public key output.  *You can generate a unique public key with each combination of secret recovery phrase, passphrase, and derivation path. Thus, with a single secret recovery phrase, you can generate many public keys. If you are just starting, just supply the secret recovery phrase you generated with the Solana Wallet Secret Recovery Phrase endpoint.*  *If you are trying to get a public key that already exists (e.g., created in the Phantom wallet), make sure you use the correct derivation path and passphrase. To read more about that, see the descriptions of those parameters below.*  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void solanaDerivePrivateKeyTest() throws ApiException {
        GetPublicKeyRequest getPublicKeyRequest = null;
                GeneratePrivateKey response = api.solanaDerivePrivateKey(getPublicKeyRequest);
        // TODO: test validations
    }
    
    /**
     * Derive public key
     *
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-wallet/derive-public-key\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Returns a public key given wallet authentication.  A wallet is identified by a public key. A public key is derived from a combination of seed phrase, derivation path, and passphrase. Changing any *one* of these three will change the public key output.   It can also be derived from a private key.  *You can generate a unique public key with each combination of secret recovery phrase, passphrase, and derivation path; or from a private key. Thus, with a single secret recovery phrase, you can generate many public keys; however, with a private key, you can only generate one public key. If you are just starting, generate a &lt;a href&#x3D;\&quot;#operation/solanaGenerateSecretRecoveryPhrase\&quot;&gt;secret recovery phrase&lt;/a&gt; or &lt;a href&#x3D;\&quot;#operation/solanaGeneratePrivateKey\&quot;&gt;private key&lt;/a&gt;.  *If you are trying to get a public key that already exists (e.g., created in the Phantom wallet), make sure you use the correct derivation path and passphrase; or just use the private key. To read more about that, see the descriptions of those parameters below.*  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void solanaDerivePublicKeyTest() throws ApiException {
        GetPublicKeyRequest getPublicKeyRequest = null;
                PublicKey response = api.solanaDerivePublicKey(getPublicKeyRequest);
        // TODO: test validations
    }
    
    /**
     * Generate private key
     *
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-wallet/generate-private-key\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Use this endpoint to securely and randomly generate a private key for a Solana wallet.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void solanaGeneratePrivateKeyTest() throws ApiException {
                GeneratePrivateKey response = api.solanaGeneratePrivateKey();
        // TODO: test validations
    }
    
    /**
     * Generate secret phrase
     *
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-wallet/generate-secret-phrase\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Use this endpoint to securely and randomly generate a secret recovery phrase for a Solana wallet.   &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void solanaGenerateSecretRecoveryPhraseTest() throws ApiException {
                SecretPhrase response = api.solanaGenerateSecretRecoveryPhrase();
        // TODO: test validations
    }
    
    /**
     * Get an airdrop on devnet
     *
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-wallet/get-airdrop\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Use this endpoint to get an airdrop of SOL on the devnet (not real SOL). Amount of 0.015,  which is the minimum amount of SOL you need to mint a Metaplex NFT and then transfer it to another wallet.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void solanaGetAirdropTest() throws ApiException {
        AirdropRequest airdropRequest = null;
                TransferResponse response = api.solanaGetAirdrop(airdropRequest);
        // TODO: test validations
    }
    
    /**
     * Get wallet&#39;s balance in SOL or any SPL
     *
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-wallet/get-wallet-balance\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      See the balance of a wallet in SOL or any SPL token.  To get the balance of an SPL token, supply the &#x60;mint_address&#x60; of the SPL token. The list of SPL tokens can be viewed &lt;a href&#x3D;\&quot;https://raw.githubusercontent.com/solana-labs/token-list/main/src/tokens/solana.tokenlist.json\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  You can also use this endpoint to see whether or not a person owns an NFT. Just supply the &#x60;mint_address&#x60; of the NFT. A balance of \&quot;1\&quot; means the person owns the NFT, and a balance of \&quot;0\&quot; means the person does not own the NFT. This works in most cases, but we are aware of one edge case where a balance of \&quot;0\&quot; will show up for a person who is actually the owner of the NFT. We just recommend using the &lt;a href&#x3D;\&quot;#operation/solanaGetNFTOwner\&quot;&gt;getNFTOwner&lt;/a&gt; endpoint and comparing that output to the expected address.  &#x60;Cost: 0.25 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void solanaGetBalanceTest() throws ApiException {
        BalanceRequest balanceRequest = null;
                BalanceResponse response = api.solanaGetBalance(balanceRequest);
        // TODO: test validations
    }
    
    /**
     * Get address&#39;s NFTs
     *
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-wallet/get-wallet-nfts\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      See the NFTs that belong to a given public key address  &#x60;Cost: 3 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void solanaGetNFTsBelongingToWalletTest() throws ApiException {
        String network = null;
        String publicKey = null;
                ListNFTsResponse response = api.solanaGetNFTsBelongingToWallet(network, publicKey);
        // TODO: test validations
    }
    
    /**
     * Get address&#39;s tokens and respective balances
     *
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-wallet/get-wallet-token-holdings\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      See the token holdings of a given public key address  &#x60;Cost: 2 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void solanaGetTokensBelongingToWalletTest() throws ApiException {
        String network = null;
        String publicKey = null;
        Boolean includeNfts = null;
        Boolean includeZeroBalanceHoldings = null;
                List<Object> response = api.solanaGetTokensBelongingToWallet(network, publicKey, includeNfts, includeZeroBalanceHoldings);
        // TODO: test validations
    }
    
    /**
     * Get address&#39;s associated transaction signatures
     *
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/solana-wallet/get-wallet-transactions\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      See the transaction signatures of a given public key address  &#x60;Cost: 1 Credits&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void solanaGetWalletTransactionsTest() throws ApiException {
        String network = null;
        String publicKey = null;
                List<String> response = api.solanaGetWalletTransactions(network, publicKey);
        // TODO: test validations
    }
    
    /**
     * Transfer SOL, a token, or an NFT to another address
     *
     * &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-wallet/transfer-sol\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See transfer SOL example (Python, JavaScript)&lt;/a&gt;.  &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples/solana-wallet/transfer-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See transfer NFT example (can also be used for SPL token) (Python, JavaScript)&lt;/a&gt;.  This is a powerful function. It might be slightly confusing because there are several optional parameters, so take some time to review it. This function can send SOL, send an SPL token, or send an NFT. You can set the fee payer of the transaction; you can sign and submit the transaction for confirmation; and you can select to simply return the compiled transaction so that you can submit it to the user for signing (e.g., via Phantom; no private keys required in this case).  Transfer SOL, a token or an NFT to another address. If you&#39;re transferring an NFT, supply the &#x60;mint&#x60; (the address of the mint) for the &#x60;token_address&#x60;.  SENDER: Note that the wallet information is used to authorize the sending of the tokens and identifies the source of the tokens. If &#x60;return_compiled_transaction &#x3D; false&#x60;, we sign and submit the transaction (&#x60;wallet&#x60; is required in this case; do not provide a value for &#x60;sender_public_key&#x60;). If &#x60;return_compiled_transaction &#x3D; true&#x60;, we compile the transaction (one of &#x60;wallet&#x60; or &#x60;sender_public_key&#x60; is required in this case; do not provide both).  RECIPIENT: &#x60;recipient_address&#x60; identifies the receiver. This is entirely separate from the information used for the SENDER above. So, in this API call, there are two wallets involved, but only one (namely, the SENDER) is needed to authorize the transaction.  FEE_PAYER: The fee payer of the transaction defaults to &#x60;wallet&#x60; (or &#x60;sender_public_key&#x60;). To set a different fee payer, provide a value for &#x60;fee_payer_wallet&#x60;.  If you&#39;re transfering a token, supply the token address found on the explorer (e.g., see &#x60;SRMuApVNdxXokk5GT7XD5cUUgXMBCoAz2LHeuAoKWRt&#x60; for &lt;a href&#x3D;\&quot;https://explorer.solana.com/address/SRMuApVNdxXokk5GT7XD5cUUgXMBCoAz2LHeuAoKWRt\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Serum Token&lt;/a&gt;) for the &#x60;token_address&#x60;. If you&#39;re transferring SOL, do not supply a value for &#x60;token_address&#x60;.  &#x60;Cost: 2 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void solanaTransferTest() throws ApiException {
        TransferRequest transferRequest = null;
                DoubleTransferResponse response = api.solanaTransfer(transferRequest);
        // TODO: test validations
    }
    
}
