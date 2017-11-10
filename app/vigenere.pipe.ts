import { Pipe, PipeTransform } from '@angular/core';

export enum CipherType {
    ENCODE = 1,
    DECODE = 0
}

@Pipe({name: 'vigenere'})
export class VigenerePipe implements PipeTransform {
    transform(message: string, type: CipherType, key: string): string {
        if (key && this.containsLetter(key)) {
            let output: string = "";
            let multi: number = type ? 1 : -1;
            let keylen = 0;
            for (let i: number = 0; i < message.length; i++) {
                if (this.isLetter(message.charAt(i))) {
                    while (!this.isLetter(key.charAt(keylen%key.length))) {
                        keylen++;
                    }
                    let valmod = this.isUpperCase(message.charAt(i)) ? "A".charCodeAt(0) : "a".charCodeAt(0);
                    let shiftmod = this.isUpperCase(key.charAt(keylen%key.length)) ? "A".charCodeAt(0) : "a".charCodeAt(0);
                    let val = message.charCodeAt(i) - valmod;
                    let shift = key.charCodeAt(keylen%key.length) - shiftmod;
                    let newval = (val + multi*shift + 26) % 26;
                    output += String.fromCharCode(newval + valmod);
                    keylen++;
                } else {
                    output += message.charAt(i);
                }
            }
            return output;
        } else {
            return message;
        }
    }

    containsLetter(phrase: string): boolean {
        for (let i: number = 0; i < phrase.length; i++) {
            if (this.isLetter(phrase.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    isLetter(ch: string): boolean {
        let value = ch.charCodeAt(0);
        if (("A".charCodeAt(0) <= value && value <= "Z".charCodeAt(0)) ||
            ("a".charCodeAt(0) <= value && value <= "z".charCodeAt(0))) {
            return true;
        } else {
            return false;
        }
    }

    isUpperCase(ch: string): boolean {
        let value = ch.charCodeAt(0);
        if ("A".charCodeAt(0) <= value && value <= "Z".charCodeAt(0)) {
            return true;
        } else {
            return false;
        }
    }
}