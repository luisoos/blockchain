# Yes, it is this easy to code a blockchain.
> GitHub: @luisoos - January 30, 2022

Coding your own blockchain may be easier than you think. In the following, I'll explain everything you need to know for your own blockchain.

## What are hashes?
To understand the blockchain you should understand what hashes are. To put it in a nutshell a blockchain is just hashing. A hash is a digital signature of a String or array.

Here's an example:

<img src="https://user-images.githubusercontent.com/81855420/151708373-4b136249-1bd6-46ce-95e7-02fbfa5c44f9.svg" alt="Hash Source Code Exmaple" style="width: 650px;">


If the digital signature of a previous block changes, the digital signature of the current block will change and so the following block changes and so on.

## Why hashes?
Hashes are very hard to crack. The more blocks are created on one block the more transactions in that block are more and more confirmed. Because the hash will be based on the previous hash, and the hash before that hash, and so on a change of any String that is going to be hashed is generating every digital signature new. This is why they are so safe.

## So how do you code your own blockchain?
You will find a remarkably easy and quick algorithm in the [Source-Code-Folder of this repository](https://github.com/luisoos/blockchain/tree/main/src). It's very easy to understand.
