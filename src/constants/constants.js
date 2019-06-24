export const ONLINE_API_URL = process.env.NODE_ENV === 'production' ? 'http://10.156.0.54/api' : 'http://10.156.0.54:8080/api';
export const OFFLINE_API_URL = 'http://10.156.0.54:8081/api';
export const ACCESS_TOKEN = 'Jwt Token';
export const EMAIL_MAX_LENGTH = 255;
export const NAME_MIN_LENGTH = 2;
export const NAME_MAX_LENGTH = 255;
export const PASSWORD_MAX_LENGTH = 16;
export const PASSWORD_MIN_LENGTH = 6;
export const PHONE_NUMBER_REGEX = RegExp('^[+]?[0-9]{11,15}$');
export const EMAIL_REGEX = RegExp('[^@ ]+@[^@ ]+\\.[^@ ]+');
export const TEXT_AREA_DEFAULT_MIN_LENGTH = 0;
export const TEXT_AREA_DEFAULT_MAX_LENGTH = 2000;
export const EVENT_NAME_MAX_LENGTH = 150;
