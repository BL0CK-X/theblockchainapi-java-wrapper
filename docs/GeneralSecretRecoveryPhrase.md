

# GeneralSecretRecoveryPhrase


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**secretRecoveryPhrase** | **String** | The 12, 15, 18, 21, or 24 word phrase that can be used to derive many public key addresses (e.g., bottom army bless castle alter habit dish embody child flame smooth zone).  To derive a wallet identifier (e.g., public key, public address, etc.), you need a secret recovery phrase, a derivation path, and an optional passphrase.   Alternatively, you can derive a wallet identifier with a private key.  Default Lengths: - Avalanche (C): 24 - Avalanche (X, P): 24 - Binance: 12 - Ethereum: 12 - Near: 12 - Solana: 12  You can use &#x60;secret_recovery_phrase&#x60; for Chains: &#x60;avalanche&#x60;, &#x60;binance&#x60;, &#x60;ethereum&#x60;, &#x60;near&#x60;, &#x60;solana&#x60;. | 
**derivationPath** | **String** | Derivation paths are used to derive the wallet identifier from the secret recovery phrase. Only correctly typed paths are accepted.  Defaults: - Avalanche (C): m/44&#39;/60&#39;/0&#39;/0/0 - Avalanche (X, P): m/44&#39;/60&#39;/0&#39;/0/0 - Binance: m/44&#39;/60&#39;/0&#39;/0/0 - Ethereum: m/44&#39;/60&#39;/0&#39;/0/0 - Near: m/44/397/0 - Solana: m/44/501/0/0  *Solana Behavior*  If you provide the empty string \&quot;\&quot; as the value for the derivation path, then we will derive your public key with the same behavior as the default behavior of the Solana CLI.  By default, we use \&quot;m/44/501/0/0\&quot;. This is the path that the Phantom and Sollet wallets use.  You can also arbitrarily increment the default path (\&quot;m/44/501/0/0\&quot;) to generate more wallets (e.g., \&quot;m/44/501/0/1\&quot;, \&quot;m/44/501/0/2\&quot;, ... AND/OR \&quot;m/44/501/1/0\&quot;, \&quot;m/44/501/2/0\&quot;, ...).  Phantom&#39;s Wallet increments the first digit (e.g., \&quot;m/44/501/0/0\&quot;, \&quot;m/44/501/1/0\&quot;, \&quot;m/44/501/2/0\&quot;, ...) to generate more public key addresses.  The SolFlare recommended path is \&quot;m/44/501/0\&quot;.  To learn more about derivation paths, check out &lt;a href&#x3D;\&quot;https://learnmeabitcoin.com/technical/derivation-paths\&quot; target&#x3D;\&quot;_blank\&quot;&gt;this tutorial&lt;/a&gt;. |  [optional]
**passphrase** | **String** | PASSPHRASE !&#x3D; PASSWORD. This is NOT your Phantom password or any other password. It is an optional string you use when creating a wallet. This provides an additional layer of security because a hacker would need both the secret recovery phrase and the passphrase to access the output public key. By default, most wallet UI extensions do not use a passphrase. (You probably did not use a passphrase.) Limited to 500 characters.  |  [optional]



