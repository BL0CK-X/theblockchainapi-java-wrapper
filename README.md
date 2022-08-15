# openapi-java-client

The Blockchain API
- API version: null
  - Build date: 2022-08-15T09:33:08.779026-07:00[America/Los_Angeles]

# About

Our vision is to make it super easy to interact with the decentralized web. We want you to be able to do this in any coding language and do it easily and quickly. 

You're a key part of our vision. We love feature requests! <a href=\"#section/Feature-Requests\">Make one!</a>

# How to Use the API

To use the API, you simply need to create an API key pair.

Doing so takes less than a minute. Simply go to <a target=\"_blank\" href=\"https://dashboard.blockchainapi.com\">the dashboard</a>, create an account, and generate a key pair. You can now use this pair to make API requests. You must create your first pair via the dashboard.

# Feature Requests

Got a feature request? Submit it as an issue on <a target=\"_blank\" href=\"https://github.com/BL0CK-X/the-blockchain-api/issues/new/choose\">our GitHub repo</a> or [email us](mailto:info@blockchainapi.com).

# Contact

<figure>
    <img 
        width=\"40px\"
        height=\"40px\" 
        src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/phone.svg\"
    />
    <figcaption style=\"textAlign:center;\">Text / Call: +1 (415) 888 4745 </figcaption>
</figure> <a href=\"mailto:info@blockchainapi.com\" target=\"_blank\">
    <figure>
        <img 
            width=\"40px\"
            height=\"40px\" 
            src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/email.svg\"
        />
        <figcaption style=\"textAlign:center;\">Email us: info@blockchainapi.com</figcaption>
    </figure>
</a> <a href=\"https://discord.gg/d49yzrZRAF\" target=\"_blank\">
    <figure>
        <img 
            width=\"40px\"
            height=\"40px\" 
            src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/discord.svg\"
        />
        <figcaption style=\"textAlign:center;\">Join our Discord</figcaption>
    </figure>
</a> <a href=\"https://twitter.com/BlockchainAP1\" target=\"_blank\">
    <figure>
        <img 
            width=\"40px\"
            height=\"40px\" 
            src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/twitter.svg\"
        />
         <figcaption style=\"textAlign:center;\">Follow us on Twitter</figcaption>
    </figure>
</a> <a href=\"https://github.com/BL0CK-X/the-blockchain-api\" target=\"_blank\">
    <figure>
        <img 
            width=\"40px\"
            height=\"40px\" 
            src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/github.svg\"
        />
        <figcaption style=\"textAlign:center;\">Star us on Github</figcaption>
    </figure>
</a>

# Security

Common dogma is to never give out your seed phrase. We agree. It's a matter of security, and anyone who has your seed phrase can irreversibly empty your wallet. 

<b>When using an API endpoint that requires a seed phrase, we highly recommend that users use or create a wallet that they do not use as their primary wallet.</b> 

How you make this work depends on what you're doing. If you're minting an NFT for example, we recommend creating a new wallet and then transferring just enough SOL to that wallet to mint the NFT. This is possible on Solana because such transactions cost less than a penny. We will have more tutorials in the future that make it easier for you to be secure when using our API.

We have easy-to-use endpoints for <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1secret_recovery_phrase/post\">creating a new seed phrase</a> and then <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1public_key/post\">deriving a public key</a> to enable you to transfer to that new wallet.

Let's have a constructive dialog about this. Feel free to <a href=\"#section/Contact\">contact us</a>. I made a video discussing this matter <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.

Note: We have had a couple of individuals harrass and threaten us. These individuals did <b>not</b> try our API or speak to anyone who has used it. They simply saw that we require a seed phrase for certain endpoints and figured that the proper response was to attack us. (I explain why we do <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.) Such harrassment and threats are not only harmful, but they are also illegal, and we will report offenders. Do not harrass us. Rather, feel free to discuss your concerns with us and we will be more than happy to work with you to come up with a solution.

# Pricing

<b>Each user receives 50,000 free credits each month.</b> Each endpoint costs a certain amount credits. Scroll below to any endpoint (i.e., function) to see how much each endpoint costs. (Or CMD+F `Cost: 0 Credit`, for example)

You can learn more about our pricing <a href=\"https://dashboard.blockchainapi.com/billing\" target=\"_blank\">here</a>. 

We frequently do custom plans. If our pricing doesn't work for you, <a href=\"#section/Contact\">contact us</a>.

If you have questions, concerns, feedback, or ideas, <a href=\"#section/Contact\">contact us</a>.

# SDKs / API Wrappers

We have examples using both our <a href=\"https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples\" target=\"_blank\">Python wrapper and our JavaScript wrapper here</a>.

We have built a custom <a href=\"https://github.com/BL0CK-X/the-blockchain-api-python-wrapper\" target=\"_blank\">Python wrapper</a>.

`pip install theblockchainapi`

We also have published a <a href=\"https://github.com/BL0CK-X/theblockchainapi-javascript-wrapper\" target=\"_blank\">JavaScript Wrapper</a>.

`npm install theblockchainapi`

We also have auto-generated wrappers for the following languages:
- <a href=\"https://github.com/BL0CK-X/theblockchainapi-go-wrapper\" target = \"_blank\">Go</a>
- <a href=\"https://github.com/BL0CK-X/theblockchainapi-java-wrapper\" target = \"_blank\">Java</a>
- <a href=\"https://github.com/BL0CK-X/theblockchainapi-kotlin-wrapper\" target = \"_blank\">Kotlin</a>
- <a href=\"https://github.com/BL0CK-X/theblockchainapi-php-wrapper\" target = \"_blank\">PHP</a>
- <a href=\"https://github.com/BL0CK-X/theblockchainapi-swift-wrapper\" target = \"_blank\">Swift5</a>
- <a href=\"https://github.com/BL0CK-X/theblockchainapi-typescript-wrapper\" target = \"_blank\">TypeScript</a>
- <a href=\"https://github.com/BL0CK-X/theblockchainapi-csharp-wrapper\" target = \"_blank\">C#</a>
- <a href=\"https://github.com/BL0CK-X/theblockchainapi-dart-wrapper\" target = \"_blank\">Dart</a>

If you would like a different language as well, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.

If you run into any bugs with the wrappers, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>null</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:null"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-null.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CcPaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.blockchainapi.com/v1");
    
    // Configure API key authorization: APIKeyID
    ApiKeyAuth APIKeyID = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyID");
    APIKeyID.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyID.setApiKeyPrefix("Token");

    // Configure API key authorization: APISecretKey
    ApiKeyAuth APISecretKey = (ApiKeyAuth) defaultClient.getAuthentication("APISecretKey");
    APISecretKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APISecretKey.setApiKeyPrefix("Token");

    CcPaymentApi apiInstance = new CcPaymentApi(defaultClient);
    String projectId = "project_WDQskRIfHQxj53N5mk5K"; // String | The ID of the project. Created and returned when a project is created.
    String paymentIdentifier = "[\"payment_97jA1szpVjrSI5EvOb5zxNQFq5CfrC\"]"; // String | You can supply either `payment_id` or `payment_validation_code`.  The `payment_id` is only visible by you and uniquely identifies a payment.  The `payment_validation_code` is shown exclusively to the customer and the owner of the project. It can be used to redeem a payment. You can verify a payment by pulling the payment with the `payment_validation_code`.
    try {
      CCPayment result = apiInstance.getCCPayment(projectId, paymentIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CcPaymentApi#getCCPayment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.blockchainapi.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CcPaymentApi* | [**getCCPayment**](docs/CcPaymentApi.md#getCCPayment) | **GET** /checkout/v1/project/{project_id}/payment/{payment_identifier} | Get a payment 
*CcPaymentApi* | [**listAllCCPayments**](docs/CcPaymentApi.md#listAllCCPayments) | **GET** /checkout/v1/payments | List all payments  
*CcPaymentApi* | [**listCCProjectPayments**](docs/CcPaymentApi.md#listCCProjectPayments) | **GET** /checkout/v1/project/{project_id}/payments | List a project&#39;s payments 
*CcProjectApi* | [**createCCProject**](docs/CcProjectApi.md#createCCProject) | **POST** /checkout/v1/project | Create a project 
*CcProjectApi* | [**deleteCCProject**](docs/CcProjectApi.md#deleteCCProject) | **DELETE** /checkout/v1/project/{project_id} | Delete a project 
*CcProjectApi* | [**getCCProject**](docs/CcProjectApi.md#getCCProject) | **GET** /checkout/v1/project/{project_id} | Get a project 
*CcProjectApi* | [**listCCProjects**](docs/CcProjectApi.md#listCCProjects) | **GET** /checkout/v1/projects | List projects 
*CcProjectApi* | [**updateCCProject**](docs/CcProjectApi.md#updateCCProject) | **PUT** /checkout/v1/project/{project_id} | Update a project 
*CcWebhookApi* | [**getCCWebhook**](docs/CcWebhookApi.md#getCCWebhook) | **POST** /webhook/v1/project/{project_id}/webhook/{webhook_identifier} | Get a webhook 
*CcWebhookApi* | [**listCCProjectWebhooks**](docs/CcWebhookApi.md#listCCProjectWebhooks) | **POST** /webhook/v1/project/{project_id}/webhooks | List project&#39;s webhooks 
*CcWebhookApi* | [**validateCCWebhook**](docs/CcWebhookApi.md#validateCCWebhook) | **POST** /webhook/v1/project/{project_id}/webhook/{webhook_identifier}/validate | Validate a webhook 
*NameServiceApi* | [**getBlockchainIdentifierFromName**](docs/NameServiceApi.md#getBlockchainIdentifierFromName) | **POST** /{blockchain}/{network}/name_service/name_to_blockchain_identifier | Get the identifier
*NameServiceApi* | [**getNameForBlockchainIdentifier**](docs/NameServiceApi.md#getNameForBlockchainIdentifier) | **POST** /{blockchain}/{network}/name_service/blockchain_identifier_to_name | Get the name
*SolanaAccountApi* | [**solanaGetAccount**](docs/SolanaAccountApi.md#solanaGetAccount) | **GET** /solana/account/{network}/{public_key} | Get the details of an account on Solana
*SolanaAccountApi* | [**solanaGetAccountIsCandyMachine**](docs/SolanaAccountApi.md#solanaGetAccountIsCandyMachine) | **GET** /solana/account/{network}/{public_key}/is_candy_machine | Get if account is candy machine
*SolanaAccountApi* | [**solanaGetAccountIsNFT**](docs/SolanaAccountApi.md#solanaGetAccountIsNFT) | **GET** /solana/account/{network}/{public_key}/is_nft | Get if account is NFT
*SolanaCandyMachineApi* | [**solanaGetAllNFTsFromCandyMachine**](docs/SolanaCandyMachineApi.md#solanaGetAllNFTsFromCandyMachine) | **GET** /solana/nft/candy_machine/{network}/{candy_machine_id}/nfts | Get CM&#39;s NFTs  
*SolanaCandyMachineApi* | [**solanaGetCandyMachineMetadata**](docs/SolanaCandyMachineApi.md#solanaGetCandyMachineMetadata) | **POST** /solana/nft/candy_machine/metadata | Get a CM&#39;s metadata 
*SolanaCandyMachineApi* | [**solanaListAllCandyMachines**](docs/SolanaCandyMachineApi.md#solanaListAllCandyMachines) | **GET** /solana/nft/candy_machine/list | List all CMs
*SolanaCandyMachineApi* | [**solanaSearchCandyMachines**](docs/SolanaCandyMachineApi.md#solanaSearchCandyMachines) | **POST** /solana/nft/candy_machine/search | Search CMs
*SolanaNftApi* | [**solanaCreateNFT**](docs/SolanaNftApi.md#solanaCreateNFT) | **POST** /solana/nft | Create an NFT on Solana
*SolanaNftApi* | [**solanaGetNFT**](docs/SolanaNftApi.md#solanaGetNFT) | **GET** /solana/nft/{network}/{mint_address} | Get an NFT&#39;s metadata
*SolanaNftApi* | [**solanaGetNFTMintFee**](docs/SolanaNftApi.md#solanaGetNFTMintFee) | **GET** /solana/nft/mint/fee | Get the NFT mint fee
*SolanaNftApi* | [**solanaGetNFTOwner**](docs/SolanaNftApi.md#solanaGetNFTOwner) | **GET** /solana/nft/{network}/{mint_address}/owner | Get owner of an NFT
*SolanaNftApi* | [**solanaGetNFTOwnerAdvanced**](docs/SolanaNftApi.md#solanaGetNFTOwnerAdvanced) | **GET** /solana/nft/{network}/{mint_address}/owner_advanced | Get owner of an NFT (advanced)
*SolanaNftApi* | [**solanaGetNFTsCandyMachineId**](docs/SolanaNftApi.md#solanaGetNFTsCandyMachineId) | **POST** /solana/nft/candy_machine_id | Get the ID of the candy machine of an NFT 
*SolanaNftApi* | [**solanaSearchNFTs**](docs/SolanaNftApi.md#solanaSearchNFTs) | **POST** /solana/nft/search | Search NFTs on Solana
*SolanaSplTokenApi* | [**solanaGetSPLToken**](docs/SolanaSplTokenApi.md#solanaGetSPLToken) | **GET** /solana/spl-token/{network}/{public_key} | Get SPL token metadata
*SolanaTransactionApi* | [**solanaGetTransaction**](docs/SolanaTransactionApi.md#solanaGetTransaction) | **GET** /solana/transaction/{network}/{tx_signature} | Get the details of a transaction made on Solana
*SolanaWalletApi* | [**solanaDeriveAssociatedTokenAccountAddress**](docs/SolanaWalletApi.md#solanaDeriveAssociatedTokenAccountAddress) | **GET** /solana/wallet/{public_key}/associated_token_account/{mint_address} | Derive an associated token account address
*SolanaWalletApi* | [**solanaDerivePrivateKey**](docs/SolanaWalletApi.md#solanaDerivePrivateKey) | **POST** /solana/wallet/private_key | Derive private key
*SolanaWalletApi* | [**solanaDerivePublicKey**](docs/SolanaWalletApi.md#solanaDerivePublicKey) | **POST** /solana/wallet/public_key | Derive public key
*SolanaWalletApi* | [**solanaGeneratePrivateKey**](docs/SolanaWalletApi.md#solanaGeneratePrivateKey) | **POST** /solana/wallet/generate/private_key | Generate private key
*SolanaWalletApi* | [**solanaGenerateSecretRecoveryPhrase**](docs/SolanaWalletApi.md#solanaGenerateSecretRecoveryPhrase) | **POST** /solana/wallet/generate/secret_recovery_phrase | Generate secret phrase
*SolanaWalletApi* | [**solanaGetAirdrop**](docs/SolanaWalletApi.md#solanaGetAirdrop) | **POST** /solana/wallet/airdrop | Get an airdrop on devnet
*SolanaWalletApi* | [**solanaGetBalance**](docs/SolanaWalletApi.md#solanaGetBalance) | **POST** /solana/wallet/balance | Get wallet&#39;s balance in SOL or any SPL
*SolanaWalletApi* | [**solanaGetNFTsBelongingToWallet**](docs/SolanaWalletApi.md#solanaGetNFTsBelongingToWallet) | **GET** /solana/wallet/{network}/{public_key}/nfts | Get address&#39;s NFTs
*SolanaWalletApi* | [**solanaGetTokensBelongingToWallet**](docs/SolanaWalletApi.md#solanaGetTokensBelongingToWallet) | **GET** /solana/wallet/{network}/{public_key}/tokens | Get address&#39;s tokens and respective balances
*SolanaWalletApi* | [**solanaGetWalletTransactions**](docs/SolanaWalletApi.md#solanaGetWalletTransactions) | **GET** /solana/wallet/{network}/{public_key}/transactions | Get address&#39;s associated transaction signatures
*SolanaWalletApi* | [**solanaTransfer**](docs/SolanaWalletApi.md#solanaTransfer) | **POST** /solana/wallet/transfer | Transfer SOL, a token, or an NFT to another address
*TokenApi* | [**getTokenMetadata**](docs/TokenApi.md#getTokenMetadata) | **GET** /{blockchain}/{network}/token/{token_blockchain_identifier} | Get a token&#39;s metadata
*TokenApi* | [**listAllTokens**](docs/TokenApi.md#listAllTokens) | **GET** /{blockchain}/{network}/all_tokens | List all tokens
*TransactionApi* | [**getTransaction**](docs/TransactionApi.md#getTransaction) | **GET** /{blockchain}/transaction/{network}/{transaction_blockchain_identifier} | Get the details of a transaction made on a blockchain
*WalletApi* | [**derivePrivateKey**](docs/WalletApi.md#derivePrivateKey) | **POST** /{blockchain}/wallet/private_key | Derive private key
*WalletApi* | [**deriveWalletIdentifier**](docs/WalletApi.md#deriveWalletIdentifier) | **POST** /{blockchain}/wallet/identifier | Derive wallet identifier
*WalletApi* | [**generatePrivateKey**](docs/WalletApi.md#generatePrivateKey) | **POST** /{blockchain}/wallet/generate/private_key | Generate private key
*WalletApi* | [**generateSeedPhrase**](docs/WalletApi.md#generateSeedPhrase) | **POST** /{blockchain}/wallet/generate/secret_recovery_phrase | Generate seed phrase
*WalletApi* | [**getAirdrop**](docs/WalletApi.md#getAirdrop) | **POST** /{blockchain}/wallet/airdrop | Get an airdrop
*WalletApi* | [**getBalance**](docs/WalletApi.md#getBalance) | **POST** /{blockchain}/wallet/balance | Get wallet&#39;s balance of X
*WalletApi* | [**transfer**](docs/WalletApi.md#transfer) | **POST** /{blockchain}/wallet/transfer | Transfer crypto, a token, or an NFT to another wallet


## Documentation for Models

 - [ATAResponse](docs/ATAResponse.md)
 - [Account](docs/Account.md)
 - [AccountContext](docs/AccountContext.md)
 - [AccountIsCandyMachine](docs/AccountIsCandyMachine.md)
 - [AccountIsNFT](docs/AccountIsNFT.md)
 - [AccountValue](docs/AccountValue.md)
 - [AirdropRequest](docs/AirdropRequest.md)
 - [AvalancheCChainPublicAddress](docs/AvalancheCChainPublicAddress.md)
 - [AvalancheXPChainPublicAddress](docs/AvalancheXPChainPublicAddress.md)
 - [B58PrivateKey](docs/B58PrivateKey.md)
 - [BSCPublicAddress](docs/BSCPublicAddress.md)
 - [BalanceRequest](docs/BalanceRequest.md)
 - [BalanceResponse](docs/BalanceResponse.md)
 - [CCPayment](docs/CCPayment.md)
 - [CCPaymentBlockchainPaymentDetails](docs/CCPaymentBlockchainPaymentDetails.md)
 - [CCProject](docs/CCProject.md)
 - [CCProjectCreateRequest](docs/CCProjectCreateRequest.md)
 - [CCProjectCreateRequestCustomerIdToCollect](docs/CCProjectCreateRequestCustomerIdToCollect.md)
 - [CCProjectCreateRequestPayoutMethod](docs/CCProjectCreateRequestPayoutMethod.md)
 - [CCWebhook](docs/CCWebhook.md)
 - [CCWebhookValidateRequest](docs/CCWebhookValidateRequest.md)
 - [CandyMachineSearchRequest](docs/CandyMachineSearchRequest.md)
 - [DoubleTransferResponse](docs/DoubleTransferResponse.md)
 - [EthereumPublicAddress](docs/EthereumPublicAddress.md)
 - [EthereumTransaction](docs/EthereumTransaction.md)
 - [EthereumTransactionCompiledResponse](docs/EthereumTransactionCompiledResponse.md)
 - [EthereumTransactionMadeResponse](docs/EthereumTransactionMadeResponse.md)
 - [FeePayerWallet](docs/FeePayerWallet.md)
 - [GeneralAirdropRequest](docs/GeneralAirdropRequest.md)
 - [GeneralB58PrivateKey](docs/GeneralB58PrivateKey.md)
 - [GeneralBalanceRequest](docs/GeneralBalanceRequest.md)
 - [GeneralBalanceResponse](docs/GeneralBalanceResponse.md)
 - [GeneralFeePayerWallet](docs/GeneralFeePayerWallet.md)
 - [GeneralGeneratePrivateKeyResponse](docs/GeneralGeneratePrivateKeyResponse.md)
 - [GeneralPrivateKey](docs/GeneralPrivateKey.md)
 - [GeneralSecretPhrase](docs/GeneralSecretPhrase.md)
 - [GeneralSecretRecoveryPhrase](docs/GeneralSecretRecoveryPhrase.md)
 - [GeneralTransaction](docs/GeneralTransaction.md)
 - [GeneralTransactionMadeResponse](docs/GeneralTransactionMadeResponse.md)
 - [GeneralTransactionResponse](docs/GeneralTransactionResponse.md)
 - [GeneralTransferRequest](docs/GeneralTransferRequest.md)
 - [GeneralWallet](docs/GeneralWallet.md)
 - [GeneratePrivateKey](docs/GeneratePrivateKey.md)
 - [GenerateSeedPhraseRequest](docs/GenerateSeedPhraseRequest.md)
 - [GetAllNFTsResponse](docs/GetAllNFTsResponse.md)
 - [GetAllNFTsResponseMintedNfts](docs/GetAllNFTsResponseMintedNfts.md)
 - [GetAllNFTsResponseUnmintedNfts](docs/GetAllNFTsResponseUnmintedNfts.md)
 - [GetCandyMachineIDRequest](docs/GetCandyMachineIDRequest.md)
 - [GetCandyMachineIDResponse](docs/GetCandyMachineIDResponse.md)
 - [GetCandyMetadataErrorResponse](docs/GetCandyMetadataErrorResponse.md)
 - [GetCandyMetadataRequest](docs/GetCandyMetadataRequest.md)
 - [GetCandyMetadataResponse](docs/GetCandyMetadataResponse.md)
 - [GetCandyMetadataResponseCreators](docs/GetCandyMetadataResponseCreators.md)
 - [GetPublicKeyRequest](docs/GetPublicKeyRequest.md)
 - [GetSPLTokenResponse](docs/GetSPLTokenResponse.md)
 - [HexPrivateKey](docs/HexPrivateKey.md)
 - [InputBlockchainIdentifier](docs/InputBlockchainIdentifier.md)
 - [InputName](docs/InputName.md)
 - [ListNFTsResponse](docs/ListNFTsResponse.md)
 - [NFT](docs/NFT.md)
 - [NFTCollection](docs/NFTCollection.md)
 - [NFTData](docs/NFTData.md)
 - [NFTMintErrorResponse](docs/NFTMintErrorResponse.md)
 - [NFTMintFee](docs/NFTMintFee.md)
 - [NFTMintRequest](docs/NFTMintRequest.md)
 - [NFTOwnerAdvancedResponse](docs/NFTOwnerAdvancedResponse.md)
 - [NFTOwnerAdvancedResponseContract](docs/NFTOwnerAdvancedResponseContract.md)
 - [NFTOwnerResponse](docs/NFTOwnerResponse.md)
 - [NFTSearchRequest](docs/NFTSearchRequest.md)
 - [NFTSearchResponse](docs/NFTSearchResponse.md)
 - [NearPublicKey](docs/NearPublicKey.md)
 - [PrivateKey](docs/PrivateKey.md)
 - [PublicKey](docs/PublicKey.md)
 - [SecretPhrase](docs/SecretPhrase.md)
 - [SecretRecoveryPhrase](docs/SecretRecoveryPhrase.md)
 - [SolanaPublicKey](docs/SolanaPublicKey.md)
 - [SolanaTransaction](docs/SolanaTransaction.md)
 - [SolanaTransactionCompiledResponse](docs/SolanaTransactionCompiledResponse.md)
 - [SolanaTransactionMadeResponse](docs/SolanaTransactionMadeResponse.md)
 - [SupplyWalletRequest](docs/SupplyWalletRequest.md)
 - [TokenMetadataResponse](docs/TokenMetadataResponse.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionResult](docs/TransactionResult.md)
 - [TransferRequest](docs/TransferRequest.md)
 - [TransferResponse](docs/TransferResponse.md)
 - [TransferResponseCompiled](docs/TransferResponseCompiled.md)
 - [Wallet](docs/Wallet.md)
 - [WalletIdentifiers](docs/WalletIdentifiers.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### APIKeyID

- **Type**: API key
- **API key parameter name**: APIKeyID
- **Location**: HTTP header

### APISecretKey

- **Type**: API key
- **API key parameter name**: APISecretKey
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@blockchainapi.com

