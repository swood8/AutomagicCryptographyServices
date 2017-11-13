import { AcsUser } from './acs-user';

export class AcsMessage {
    id: number;
    sender: AcsUser;
    receiver: AcsUser;
    message: string;
    sent: string;
    read: string;
}